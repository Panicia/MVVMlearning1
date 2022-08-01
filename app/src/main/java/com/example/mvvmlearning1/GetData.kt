package com.example.mvvmlearning1

import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.LifecycleOwner


class GetData : DefaultLifecycleObserver {

    override fun onStart(owner: LifecycleOwner) {
        super.onStart(owner)
        getData()
    }

    override fun onStop(owner: LifecycleOwner) {
        super.onStop(owner)
        sendData()
    }

    private fun getData() {
        println("get data")
    }

    private fun sendData() {
        println("save data")
    }
}