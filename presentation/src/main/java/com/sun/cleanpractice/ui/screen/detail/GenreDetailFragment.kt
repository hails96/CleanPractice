package com.sun.cleanpractice.ui.screen.detail


import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.navigation.fragment.navArgs
import com.sun.cleanpractice.R
import com.sun.cleanpractice.databinding.FragmentGenreDetailBinding
import com.sun.cleanpractice.ui.base.BaseFragment
import org.koin.androidx.viewmodel.ext.android.viewModel

class GenreDetailFragment : BaseFragment<FragmentGenreDetailBinding, GenreDetailViewModel>() {

    override val viewModel: GenreDetailViewModel by viewModel()
    override val layoutId: Int = R.layout.fragment_genre_detail
    private val args: GenreDetailFragmentArgs by navArgs()

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        setupObservers()
        viewModel.getMovieFromGenre(args.genre ?: return)
    }

    private fun setupObservers() {
        viewModel.movies.observe(viewLifecycleOwner, Observer {
            Toast.makeText(context, it.size.toString(), Toast.LENGTH_SHORT).show()
        })
    }
}

