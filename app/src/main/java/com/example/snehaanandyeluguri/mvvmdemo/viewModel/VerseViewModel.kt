package com.example.snehaanandyeluguri.mvvmdemo.viewModel

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import com.example.snehaanandyeluguri.mvvmdemo.model.Response
import com.example.snehaanandyeluguri.mvvmdemo.service.ApiService
import retrofit2.Call
import retrofit2.Callback

class VerseViewModel: ViewModel(),Callback<Response> {
    var verse=MutableLiveData<Response>()
    var wikiApiServe: ApiService
    var showProgress=MutableLiveData<Boolean>()
    var showError=false

    init{
        wikiApiServe = ApiService.create()
    }

    fun fetchData(){
        showError=false
        showProgress.value=true
        wikiApiServe.getVerse("json").enqueue(this)
    }

    override fun onFailure(call: Call<Response>?, t: Throwable?) {
        showError=true
        showProgress.value=false
    }

    override fun onResponse(call: Call<Response>?, response: retrofit2.Response<Response>) {
       if(response.isSuccessful) verse.value=(response.body())
        else showError=true
        showProgress.value=false
    }
}