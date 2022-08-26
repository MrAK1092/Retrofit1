package com.example.retrofit

import com.example.retrofit.Model.Movie
import retrofit2.http.GET
import retrofit2.Call

interface RetrofitServices {
    @GET("marvel")
    fun getMovieList(): Call<MutableList<Movie>>
}