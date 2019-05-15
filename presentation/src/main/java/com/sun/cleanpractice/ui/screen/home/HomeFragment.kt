package com.sun.cleanpractice.ui.screen.home


import com.sun.cleanpractice.R
import com.sun.cleanpractice.databinding.FragmentHomeBinding
import com.sun.cleanpractice.ui.base.BaseFragment
import org.koin.androidx.viewmodel.ext.android.viewModel

class HomeFragment : BaseFragment<FragmentHomeBinding, HomeViewModel>() {

    override val viewModel: HomeViewModel by viewModel()
    override val layoutId: Int = R.layout.fragment_home

}

