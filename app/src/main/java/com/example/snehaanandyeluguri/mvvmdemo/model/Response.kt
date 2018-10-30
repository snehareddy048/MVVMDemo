package com.example.snehaanandyeluguri.mvvmdemo.model

import com.google.gson.annotations.SerializedName

data class Response(

	@field:SerializedName("verse")
	val verse: Verse? = null
)