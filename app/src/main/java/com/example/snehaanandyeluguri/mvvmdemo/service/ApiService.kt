package com.example.snehaanandyeluguri.mvvmdemo.service

import com.example.snehaanandyeluguri.mvvmdemo.model.Response
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

@GET("v1/get/")
    fun getVerse(@Query("format") format: String): Call<Response>

    companion object {
        fun create():ApiService{
            val retrofit=Retrofit.Builder()
                    .baseUrl("https://beta.ourmanna.com/api/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()

            return retrofit.create(ApiService::class.java);
        }

    }
}
