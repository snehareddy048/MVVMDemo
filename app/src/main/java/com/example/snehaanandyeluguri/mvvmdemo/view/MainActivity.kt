package com.example.snehaanandyeluguri.mvvmdemo.view

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.snehaanandyeluguri.mvvmdemo.R
import com.example.snehaanandyeluguri.mvvmdemo.viewModel.VerseViewModel
import kotlinx.android.synthetic.main.activity_main.*
import com.example.snehaanandyeluguri.mvvmdemo.databinding.ActivityMainBinding
import com.example.snehaanandyeluguri.mvvmdemo.model.Details

class MainActivity : AppCompatActivity() {

    lateinit var verseViewModel: VerseViewModel;
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.setContentView(this,R.layout.activity_main)
        verseViewModel=ViewModelProviders.of(this).get(VerseViewModel::class.java)
        verseViewModel.fetchData()

        verseViewModel.verse.observe(this, Observer {
            var details = Details()
            details.text=it?.verse?.details?.text
            binding.details=details
        })
        verseViewModel.showProgress.observe(this, Observer {
            it?.let{
                    binding.progressbarvisibility = it
                    if(verseViewModel.showError) {
                    Toast.makeText(this, getString(R.string.error_response), Toast.LENGTH_LONG).show()
                }
            }
        })
    }


}
