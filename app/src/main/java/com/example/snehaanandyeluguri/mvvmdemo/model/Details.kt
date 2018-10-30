package com.example.snehaanandyeluguri.mvvmdemo.model

import com.google.gson.annotations.SerializedName

data class Details(

	@field:SerializedName("reference")
	val reference: String? = null,

	@field:SerializedName("verseurl")
	val verseurl: String? = null,

	@field:SerializedName("text")
	val text: String? = null,

	@field:SerializedName("version")
	val version: String? = null
)