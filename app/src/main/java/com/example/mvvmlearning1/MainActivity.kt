package com.example.mvvmlearning1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.*
import com.example.mvvmlearning1.databinding.ActivityMainBinding



class MainActivity : AppCompatActivity() {

    lateinit var mViewModel : MainViewModel

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //binding = ActivityMainBinding.inflate(layoutInflater)
        //setContentView(binding.root)

        mViewModel = ViewModelProvider(this, MainFactory(application, "factory"))[MainViewModel::class.java]
    }

    override fun onStart() {
        super.onStart()

        mViewModel.liveData.observe(this, Observer {
            //binding.testText.text = it
        })
    }
}