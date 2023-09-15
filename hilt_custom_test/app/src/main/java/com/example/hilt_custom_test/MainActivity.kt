package com.example.hilt_custom_test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hilt_custom_test.computer_system_hilt_binding.BuildLaptop
import com.example.hilt_custom_test.computer_system_hilt_binding.Gaming
import com.example.hilt_custom_test.phone_system_hilt_provide.PhoneUseType
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var  gaming : Gaming
    @Inject
    lateinit var buildLaptop : BuildLaptop

    @Inject
    lateinit var phoneUseType: PhoneUseType
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        gaming.chooseHardware()
        buildLaptop.onBuildLaptop()

        phoneUseType.onChoosePhoneTye()
    }
}