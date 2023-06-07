package com.app.minitest

import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.flowWithLifecycle
import androidx.lifecycle.lifecycleScope
import com.app.minitest.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var adapter: MiniTestAdapter
    private val viewModel by viewModels<MiniTestViewModel>()

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            rvMiniTest.adapter = adapter
            lifecycleScope.launch {
                viewModel.getData
                    .flowWithLifecycle(lifecycle, Lifecycle.State.STARTED)
                    .collect { uiState ->
                        when (uiState) {
                            is UiState.Error -> {
                                binding.progressBar.visibility = View.GONE
                            }

                            UiState.Loading -> {
                                binding.progressBar.visibility = View.VISIBLE
                            }

                            is UiState.Success -> {
                                binding.progressBar.visibility = View.GONE
                                adapter.submitList(uiState.data.miniTestResponse)
                            }
                        }
                    }
            }
        }
    }
}