package com.sun.cleanpractice.ui.screen.genredetail


import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.navigation.fragment.navArgs
import com.sun.cleanpractice.R
import com.sun.cleanpractice.databinding.FragmentGenreDetailBinding
import com.sun.cleanpractice.ui.base.BaseFragment
import org.koin.androidx.viewmodel.ext.viewModel

class GenreDetailFragment : BaseFragment<FragmentGenreDetailBinding, GenreDetailViewModel>() {

    override val viewModel: GenreDetailViewModel by viewModel()
    override val layoutId: Int = R.layout.fragment_genre_detail
    private val args: GenreDetailFragmentArgs by navArgs()
    private lateinit var movieListAdapter: MovieListAdapter

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        movieListAdapter = MovieListAdapter {

        }
        setupObservers()
        viewModel.getMovieFromGenre(args.genre ?: return)
    }

    private fun setupObservers() {
        viewModel.movies.observe(viewLifecycleOwner, Observer {

        })
    }
}

