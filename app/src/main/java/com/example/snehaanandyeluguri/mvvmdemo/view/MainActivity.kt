package com.example.snehaanandyeluguri.mvvmdemo.view

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.snehaanandyeluguri.mvvmdemo.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tv_verse.text="Fear not I am here"
    }
}
