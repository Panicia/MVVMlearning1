package com.example.mvvmlearning1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Transformation
import androidx.lifecycle.*
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.example.mvvmlearning1.databinding.ActivityMainBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


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