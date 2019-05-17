package com.sun.cleanpractice.ui.screen.genredetail

import androidx.recyclerview.widget.DiffUtil
import com.sun.cleanpractice.R
import com.sun.cleanpractice.databinding.ItemMovieBinding
import com.sun.cleanpractice.model.MovieItem
import com.sun.cleanpractice.ui.base.BaseRecyclerAdapter

class MovieListAdapter(
    val itemClickListener: (MovieItem) -> Unit
) : BaseRecyclerAdapter<MovieItem, ItemMovieBinding>(object : DiffUtil.ItemCallback<MovieItem>() {
    override fun areItemsTheSame(oldItem: MovieItem, newItem: MovieItem): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: MovieItem, newItem: MovieItem): Boolean {
        return oldItem == newItem
    }
}) {

    override fun getLayoutRes(viewType: Int): Int = R.layout.item_movie

    override fun bindFirstTime(binding: ItemMovieBinding) {
        binding.apply {
            root.setOnClickListener {
                item?.apply {
                    itemClickListener(this)
                }
            }
        }
    }
}