package com.example.movieapp.api

import com.example.movieapp.model.Movie
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface MovieApi {
    @GET
    suspend fun  getMovie(
        @Query("t") t: String?,
        @Query("apikey") key: String?
    ): Movie
}