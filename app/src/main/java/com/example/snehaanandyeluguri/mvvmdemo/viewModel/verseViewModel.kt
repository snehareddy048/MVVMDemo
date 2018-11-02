package com.example.snehaanandyeluguri.mvvmdemo.viewModel

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import android.widget.Toast
import com.example.snehaanandyeluguri.mvvmdemo.R.id.tv_verse
import com.example.snehaanandyeluguri.mvvmdemo.model.Response
import com.example.snehaanandyeluguri.mvvmdemo.model.Verse
import com.example.snehaanandyeluguri.mvvmdemo.service.ApiService
//import io.reactivex.android.schedulers.AndroidSchedulers
//import io.reactivex.schedulers.Schedulers
import kotlinx.android.synthetic.main.activity_main.*

class verseViewModel: ViewModel() {
    private val verse=MutableLiveData<Response>()

    fun init(){
        //TODO:move this out of activity
//        verse=wikiApiServe.getVerse( "json")
//                .subscribeOn(Schedulers.io())
//                .observeOn(AndroidSchedulers.mainThread())
//                .subscribe(
//                        { result -> tv_verse.text = "${result.verse?.details?.text}" },//TODO:observer in java
//                        { error -> Toast.makeText(this, error.message, Toast.LENGTH_SHORT).show() }
//                        //TODO:observer in java
//                )
    }

    private val wikiApiServe by lazy {
        ApiService.create()
    }
}