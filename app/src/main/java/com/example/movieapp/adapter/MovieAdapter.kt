package com.example.movieapp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.movieapp.R
import com.example.movieapp.databinding.ReciclerViewItemBinding
import com.example.movieapp.model.Movie

class MovieAdapter : RecyclerView.Adapter<MovieAdapter.MyViewHolder>() {
    private var myMovieList = emptyList<Movie>()

    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return MyViewHolder(layoutInflater.inflate(R.layout.recicler_view_item, parent, false))
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val binding = ReciclerViewItemBinding.bind(holder.itemView)
        binding.tvTitleText.text = myMovieList[position].title
        binding.tvGenreText.text = myMovieList[position].genre
        binding.tvYearText.text = myMovieList[position].year
        Glide.with(holder.itemView)
            .load(myMovieList[position].poster)
            .into(binding.imgPoster)
    }

    override fun getItemCount(): Int = myMovieList.size

    fun setData(newMovieList: Movie) {
        myMovieList = listOf(newMovieList)
        notifyDataSetChanged()
    }
}