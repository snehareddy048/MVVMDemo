package com.example.snehaanandyeluguri.mvvmdemo.view

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.snehaanandyeluguri.mvvmdemo.R
import com.example.snehaanandyeluguri.mvvmdemo.service.ApiService
import kotlinx.android.synthetic.main.activity_main.*
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tv_verse.text="Fear not I am here"
        //TODO:move this out of activity
        wikiApiServe.getVerse( "json")
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(
                        { result -> tv_verse.text = "${result.verse?.details?.text}" },
                        { error -> Toast.makeText(this, error.message, Toast.LENGTH_SHORT).show() }
                )
    }

    private val wikiApiServe by lazy {
        ApiService.create()
    }
}
