package com.sun.cleanpractice.ui.screen.navigation

import android.os.Bundle
import androidx.navigation.Navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.sun.cleanpractice.R
import com.sun.cleanpractice.databinding.FragmentNavigationBinding
import com.sun.cleanpractice.ui.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_navigation.*
import org.koin.androidx.viewmodel.ext.viewModel

class NavigationFragment : BaseFragment<FragmentNavigationBinding, NavigationViewModel>() {

    override val viewModel: NavigationViewModel by viewModel()
    override val layoutId: Int = R.layout.fragment_navigation

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        bottomNavigationView.setupWithNavController(
            findNavController(activity ?: return, R.id.navHostNavigation)
        )
    }

}
