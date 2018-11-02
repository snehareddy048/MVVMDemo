package com.example.snehaanandyeluguri.mvvmdemo.view

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.snehaanandyeluguri.mvvmdemo.R
import com.example.snehaanandyeluguri.mvvmdemo.service.ApiService
import kotlinx.android.synthetic.main.activity_main.*
//import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tv_verse.text="Fear not I am here"

    }


}
