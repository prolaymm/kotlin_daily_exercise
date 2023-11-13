package com.example.hilt_custom_test.computer_system_hilt_binding

import android.util.Log
import javax.inject.Inject

class  Gaming @Inject constructor() : Hardware() {
    override fun chooseHardware() {
        Log.d("LAPTOP", "GAMING HARDWARE")
    }

}