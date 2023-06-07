package com.app.minitest

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.app.minitest.databinding.ItemMiniTestBinding
import com.bumptech.glide.Glide
import javax.inject.Inject

class MiniTestAdapter @Inject constructor() :
    ListAdapter<MiniTestResponseItem, MiniTestAdapter.MiniTestViewHolder>(
        DIFF_CALLBACK
    ) {
    inner class MiniTestViewHolder(private val binding: ItemMiniTestBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(item: MiniTestResponseItem) {
            binding.apply {
                Glide.with(itemView.context)
                    .load(item.embedded?.show?.image?.original)
                    .into(imgView)
                tvName.text = item.name
                tvGenre.text = item.embedded?.show?.genres?.joinToString(", ")
                tvRating.text = item.rating?.average?.toString() ?: "0"
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MiniTestViewHolder =
        ItemMiniTestBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        ).run {
            MiniTestViewHolder(this)
        }

    override fun onBindViewHolder(holder: MiniTestViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    companion object {
        private val DIFF_CALLBACK = object : DiffUtil.ItemCallback<MiniTestResponseItem>() {
            override fun areItemsTheSame(
                oldItem: MiniTestResponseItem,
                newItem: MiniTestResponseItem
            ): Boolean = oldItem.id == newItem.id

            override fun areContentsTheSame(
                oldItem: MiniTestResponseItem,
                newItem: MiniTestResponseItem
            ): Boolean = oldItem == newItem
        }
    }
}