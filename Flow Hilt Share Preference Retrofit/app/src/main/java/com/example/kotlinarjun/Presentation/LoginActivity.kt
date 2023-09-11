package com.example.kotlinarjun.Presentation

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.example.kotlinarjun.R
import com.example.kotlinarjun.core.helper.TokenHelper
import com.example.kotlinarjun.util.LOGIN_TOKEN
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class LoginActivity : AppCompatActivity() {

    @Inject
    lateinit var tokenHelper: TokenHelper
    lateinit var  loginButton: Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        loginButton = findViewById(R.id.login_button)


        val myToken : String = tokenHelper.getToken(LOGIN_TOKEN)

        if(myToken == "login") {
            val intent  = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }

        loginButton.setOnClickListener{
            tokenHelper.saveToken(LOGIN_TOKEN,"login")
            Toast.makeText(this,"Login Success",Toast.LENGTH_LONG).show()
        }


    }
}