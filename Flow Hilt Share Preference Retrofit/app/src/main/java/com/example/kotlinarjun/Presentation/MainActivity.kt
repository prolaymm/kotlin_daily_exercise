package com.example.kotlinarjun.Presentation
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.example.kotlinarjun.R
import com.example.kotlinarjun.viewmodel.PostViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.flow

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    val postViewModel : PostViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        postViewModel.getAllPost()




    }

    fun product() = flow<Int>{

        val list = listOf<Int>(1,2,3,4,5)

        list.forEach{

            delay(3000)
            emit(it)
        }
    }


}