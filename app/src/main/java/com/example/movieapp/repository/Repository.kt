package com.example.movieapp.repository

import com.example.movieapp.api.RetrofitInstance
import com.example.movieapp.model.Movie
import com.example.movieapp.util.Constants.Companion.KEY
import retrofit2.Call
import retrofit2.Response

class Repository {

    suspend fun getMovie( search:String): Response<Movie> {
        return RetrofitInstance.api.getMovie(search )
    }
}