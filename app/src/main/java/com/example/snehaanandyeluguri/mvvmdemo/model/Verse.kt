package com.example.snehaanandyeluguri.mvvmdemo.model


import com.google.gson.annotations.SerializedName

data class Verse(

	@field:SerializedName("details")
	val details: Details? = null,

	@field:SerializedName("notice")
	val notice: String? = null
)