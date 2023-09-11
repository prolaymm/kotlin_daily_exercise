package com.example.kotlinarjun.service

sealed  class ApiState<T> {

    class Loading<T>() : ApiState<T>()
    class  Failure<T>(val  message: String) : ApiState<T>()
    class Success<T>(val data: T ) : ApiState<T>()

}