package com.example.movieapp.repository

import com.example.movieapp.api.RetrofitInstance
import com.example.movieapp.model.Movie
import com.example.movieapp.util.Constants.Companion.KEY

class Repository {

    suspend fun getMovie( search:String): Movie {
        return RetrofitInstance.api.getMovie(search,KEY )
    }
}