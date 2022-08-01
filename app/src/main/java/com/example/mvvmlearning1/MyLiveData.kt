package com.example.mvvmlearning1

import androidx.lifecycle.LiveData

class MyLiveData : LiveData<String>() {


    fun setValueToLiveData(string : String){
        value = string
    }

    override fun onActive() {
        super.onActive()
        println("OnActive")
    }

    override fun onInactive() {
        super.onInactive()
        println("OnInactive")
    }
}