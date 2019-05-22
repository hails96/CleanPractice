package com.sun.cleanpractice.ui.screen.favorite


import android.os.Bundle
import com.sun.cleanpractice.R
import com.sun.cleanpractice.databinding.FragmentFavoriteBinding
import com.sun.cleanpractice.ui.base.BaseFragment
import org.koin.androidx.viewmodel.ext.viewModel

class FavoriteFragment : BaseFragment<FragmentFavoriteBinding, FavoriteViewModel>() {

    override val viewModel: FavoriteViewModel by viewModel()
    override val layoutId: Int = R.layout.fragment_favorite

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
    }
}

