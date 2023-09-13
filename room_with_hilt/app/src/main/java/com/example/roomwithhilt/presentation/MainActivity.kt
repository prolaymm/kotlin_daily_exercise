package com.example.roomwithhilt.presentation

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import androidx.activity.viewModels
import com.example.roomwithhilt.R
import com.example.roomwithhilt.data.vos.TodoVo
import com.example.roomwithhilt.viewmodel.MainViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {




     private val mainViewModel: MainViewModel by  viewModels()
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val button : Button = findViewById(R.id.add_db)

        button.setOnClickListener{

            GlobalScope.launch(Dispatchers.IO){
                try{
                    mainViewModel.databaseSize(TodoVo( title= "id Title", description = "This is description"))
                    Log.d("arjun","Success")
                    Toast.makeText(this@MainActivity,"Database Added",Toast.LENGTH_LONG).show()
                } catch (error : Exception){
                    Toast.makeText(this@MainActivity,"Fail",Toast.LENGTH_LONG).show()
                    Log.d("arjun","$error")
                }
            }

        }


    }
}



