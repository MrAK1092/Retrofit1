package com.example.retrofit.Common

import com.example.retrofit.Retrofit.RetrofitClient
import com.example.retrofit.RetrofitServices

object Common {
    private val BASE_URL = "https://www.simplifiedcoding.net/demos/"
    val retrofitService: RetrofitServices
        get() = RetrofitClient.getClient(BASE_URL).create(RetrofitServices::class.java)
}