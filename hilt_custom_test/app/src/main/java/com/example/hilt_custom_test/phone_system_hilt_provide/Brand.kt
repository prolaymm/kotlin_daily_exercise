package com.example.hilt_custom_test.phone_system_hilt_provide

import android.util.Log
import javax.inject.Inject

interface Brand {

    fun chooseBrandName()
}

class GamingBrand @Inject constructor(): Brand {

    override fun chooseBrandName() {
        Log.d("MOBILE","APPLE HAS BEEN CHOOSE")
    }
}