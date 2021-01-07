package com.example.movieapp.model

import com.google.gson.annotations.SerializedName

data class Movie(
        @SerializedName("Title")
        val title: String,
        @SerializedName("Year")
        val year: String,
        @SerializedName("Released")
        val released: String,
        @SerializedName("Rated")
        val rated: String,
        @SerializedName("Runtime")
        val runtime: String,
        @SerializedName("Genre")
        val genre: String,
        @SerializedName("Director")
        val director: String,
        @SerializedName("Poster")
        val poster: String
)