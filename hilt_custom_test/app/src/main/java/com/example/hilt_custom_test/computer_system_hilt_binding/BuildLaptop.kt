package com.example.hilt_custom_test.computer_system_hilt_binding

import android.util.Log
import javax.inject.Inject

class BuildLaptop @Inject constructor(val gaming: Gaming) {


    init {

        println("Building laptop success")
    }

    fun onBuildLaptop() {
        Log.d("LAPTOP","LAPTOP BUILD SUCCESS")
    }
}