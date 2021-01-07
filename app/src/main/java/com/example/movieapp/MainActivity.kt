package com.example.movieapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.movieapp.repository.Repository

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var viewModel: MainViewModel
    private var search: EditText? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        search = findViewById<EditText>(R.id.edt_search)
        findViewById<Button>(R.id.btn_search).setOnClickListener(this)


    }

    override fun onClick(v: View?) {

        val repository = Repository()
        val viewModelFactory = MainViewModelFactory(repository)
        viewModel = ViewModelProvider(this, viewModelFactory).get(MainViewModel::class.java)
        viewModel.getMovie(search.toString())
        viewModel.myResponse.observe(this, Observer { response ->
            if (response.isSuccessful) {
                Log.d("Response", response.body().toString())
                search?.setText(response.body()?.rated.toString())
            } else {
                Log.d("Response", response.errorBody().toString())
            }

        })
    }
}