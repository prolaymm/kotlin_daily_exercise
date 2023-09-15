package com.example.hilt_custom_test.phone_system_hilt_provide

import android.util.Log
import javax.inject.Inject

class PhoneUseType @Inject constructor(val brand: Brand) {

   fun onChoosePhoneTye(){

        Log.d("MOBILE","SECUREPHONE SELECT")
       brand.chooseBrandName()
    }
}