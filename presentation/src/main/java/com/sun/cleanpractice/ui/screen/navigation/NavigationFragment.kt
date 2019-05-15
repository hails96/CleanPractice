package com.sun.cleanpractice.ui.screen.navigation


import com.sun.cleanpractice.R
import com.sun.cleanpractice.databinding.FragmentNavigationBinding
import com.sun.cleanpractice.ui.base.BaseFragment
import org.koin.androidx.viewmodel.ext.android.viewModel

class NavigationFragment : BaseFragment<FragmentNavigationBinding, NavigationViewModel>() {

    override val viewModel: NavigationViewModel by viewModel()
    override val layoutId: Int = R.layout.fragment_navigation

}
