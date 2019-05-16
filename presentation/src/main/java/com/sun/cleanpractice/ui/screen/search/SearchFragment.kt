package com.sun.cleanpractice.ui.screen.search


import android.os.Bundle
import com.sun.cleanpractice.R
import com.sun.cleanpractice.databinding.FragmentSearchBinding
import com.sun.cleanpractice.ui.base.BaseFragment
import org.koin.androidx.viewmodel.ext.android.viewModel

class SearchFragment : BaseFragment<FragmentSearchBinding, SearchViewModel>() {

    override val viewModel: SearchViewModel by viewModel()
    override val layoutId: Int = R.layout.fragment_search

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
    }
}

