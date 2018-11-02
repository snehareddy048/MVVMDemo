package com.example.snehaanandyeluguri.mvvmdemo.service

import android.arch.lifecycle.MutableLiveData
import com.example.snehaanandyeluguri.mvvmdemo.model.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
//import io.reactivex.Observable

interface ApiService {

//     val BASE_URL="https://beta.ourmanna.com/api/v1/get/?format=json"

@GET("v1/get/")
fun getVerse(@Query("format") format: String): MutableLiveData<Response>

    companion object Factory{
        fun create():ApiService{
            val retrofit=Retrofit.Builder().addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .addConverterFactory(GsonConverterFactory.create())
                    .baseUrl("https://beta.ourmanna.com/api/")
                    .build()

            return retrofit.create(ApiService::class.java);
        }

    }

}