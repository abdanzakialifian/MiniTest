package com.app.minitest

import com.google.gson.annotations.SerializedName

data class MiniTestResponse(

	@field:SerializedName("MiniTestResponse")
	val miniTestResponse: List<MiniTestResponseItem?>? = null
)

data class Externals(

	@field:SerializedName("thetvdb")
	val thetvdb: Int? = null,

	@field:SerializedName("imdb")
	val imdb: String? = null,

	@field:SerializedName("tvrage")
	val tvrage: Any? = null
)

data class Rating(

	@field:SerializedName("average")
	val average: Any? = null
)

data class Schedule(

	@field:SerializedName("days")
	val days: List<String?>? = null,

	@field:SerializedName("time")
	val time: String? = null
)

data class Links(

	@field:SerializedName("self")
	val self: Self? = null,

	@field:SerializedName("previousepisode")
	val previousepisode: Previousepisode? = null,

	@field:SerializedName("show")
	val show: Show? = null
)

data class Previousepisode(

	@field:SerializedName("href")
	val href: String? = null
)

data class WebChannel(

	@field:SerializedName("country")
	val country: Country? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("id")
	val id: Int? = null,

	@field:SerializedName("officialSite")
	val officialSite: String? = null
)

data class Country(

	@field:SerializedName("code")
	val code: String? = null,

	@field:SerializedName("timezone")
	val timezone: String? = null,

	@field:SerializedName("name")
	val name: String? = null
)

data class Image(

	@field:SerializedName("original")
	val original: String? = null,

	@field:SerializedName("medium")
	val medium: String? = null
)

data class Network(

	@field:SerializedName("country")
	val country: Country? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("id")
	val id: Int? = null,

	@field:SerializedName("officialSite")
	val officialSite: String? = null
)

data class Embedded(

	@field:SerializedName("show")
	val show: Show? = null
)

data class Show(

	@field:SerializedName("summary")
	val summary: String? = null,

	@field:SerializedName("image")
	val image: Image? = null,

	@field:SerializedName("averageRuntime")
	val averageRuntime: Int? = null,

	@field:SerializedName("dvdCountry")
	val dvdCountry: Any? = null,

	@field:SerializedName("_links")
	val links: Links? = null,

	@field:SerializedName("premiered")
	val premiered: String? = null,

	@field:SerializedName("rating")
	val rating: Rating? = null,

	@field:SerializedName("runtime")
	val runtime: Int? = null,

	@field:SerializedName("weight")
	val weight: Int? = null,

	@field:SerializedName("language")
	val language: String? = null,

	@field:SerializedName("type")
	val type: String? = null,

	@field:SerializedName("url")
	val url: String? = null,

	@field:SerializedName("officialSite")
	val officialSite: String? = null,

	@field:SerializedName("network")
	val network: Network? = null,

	@field:SerializedName("schedule")
	val schedule: Schedule? = null,

	@field:SerializedName("webChannel")
	val webChannel: WebChannel? = null,

	@field:SerializedName("genres")
	val genres: List<String?>? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("ended")
	val ended: String? = null,

	@field:SerializedName("id")
	val id: Int? = null,

	@field:SerializedName("externals")
	val externals: Externals? = null,

	@field:SerializedName("updated")
	val updated: Int? = null,

	@field:SerializedName("status")
	val status: String? = null,

	@field:SerializedName("href")
	val href: String? = null
)

data class Self(

	@field:SerializedName("href")
	val href: String? = null
)

data class MiniTestResponseItem(

	@field:SerializedName("summary")
	val summary: String? = null,

	@field:SerializedName("image")
	val image: Any? = null,

	@field:SerializedName("_links")
	val links: Links? = null,

	@field:SerializedName("airdate")
	val airdate: String? = null,

	@field:SerializedName("rating")
	val rating: Rating? = null,

	@field:SerializedName("runtime")
	val runtime: Int? = null,

	@field:SerializedName("airstamp")
	val airstamp: String? = null,

	@field:SerializedName("type")
	val type: String? = null,

	@field:SerializedName("url")
	val url: String? = null,

	@field:SerializedName("number")
	val number: Int? = null,

	@field:SerializedName("airtime")
	val airtime: String? = null,

	@field:SerializedName("_embedded")
	val embedded: Embedded? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("season")
	val season: Int? = null,

	@field:SerializedName("id")
	val id: Int? = null
)
