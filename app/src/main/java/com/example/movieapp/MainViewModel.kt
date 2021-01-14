package com.example.movieapp

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.movieapp.model.Movie
import com.example.movieapp.repository.Repository
import kotlinx.coroutines.launch
import retrofit2.Response

class MainViewModel(private val repository: Repository) : ViewModel() {

    val myResponse: MutableLiveData<Response<Movie>> = MutableLiveData()
    fun getMovie(search: String) {
        viewModelScope.launch {
            val response: Response<Movie> = repository.getMovie(search)
            myResponse.value = response
        }

    }

}