package com.sun.cleanpractice.ui.screen.home

import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.navigation.NavController
import androidx.navigation.Navigation.findNavController
import com.sun.cleanpractice.R
import com.sun.cleanpractice.databinding.FragmentHomeBinding
import com.sun.cleanpractice.ui.base.BaseFragment
import com.sun.cleanpractice.ui.screen.navigation.NavigationFragmentDirections
import org.koin.androidx.viewmodel.ext.android.viewModel

class HomeFragment : BaseFragment<FragmentHomeBinding, HomeViewModel>() {

    override val viewModel: HomeViewModel by viewModel()
    override val layoutId: Int = R.layout.fragment_home
    private lateinit var navController: NavController

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        navController = findNavController(activity ?: return, R.id.navHostFragment)
        setupObservers()
    }

    private fun setupObservers() {
        viewModel.genre.observe(viewLifecycleOwner, Observer {
            navController.navigate(NavigationFragmentDirections.fromGenreToDetail(it))
        })
    }
}
