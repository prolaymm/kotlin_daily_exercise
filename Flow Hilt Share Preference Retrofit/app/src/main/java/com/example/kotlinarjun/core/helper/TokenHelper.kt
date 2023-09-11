package com.example.kotlinarjun.core.helper

import android.content.Context
import com.example.kotlinarjun.util.LOGIN_TOKEN
import com.example.kotlinarjun.util.PREF_TOKEN
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

class TokenHelper @Inject constructor(@ApplicationContext context: Context) {

    private var pref = context.getSharedPreferences(PREF_TOKEN,Context.MODE_PRIVATE)


    fun saveToken( name : String,value: String,) {
        val editor = pref.edit()
        editor.putString(name,value)
        editor.apply()
    }
    fun getToken(name: String) : String {

        return pref.getString(name,"")?:""
    }
}