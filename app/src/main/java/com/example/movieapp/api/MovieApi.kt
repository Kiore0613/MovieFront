package com.example.movieapp.api

import com.example.movieapp.model.Movie
import com.example.movieapp.util.Constants.Companion.KEY
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface MovieApi {
    @GET(KEY)
     suspend fun  getMovie(
        @Query("t") t: String?
    ): Response<Movie>
}