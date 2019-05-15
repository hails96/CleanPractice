package com.sun.cleanpractice.di

import com.sun.cleanpractice.ui.screen.home.HomeViewModel
import com.sun.cleanpractice.ui.screen.navigation.NavigationViewModel
import com.sun.cleanpractice.ui.screen.main.MainViewModel
import org.koin.androidx.viewmodel.ext.koin.viewModel
import org.koin.dsl.module.module

val viewModelModule = module {
    viewModel { MainViewModel() }
    viewModel { NavigationViewModel() }
    viewModel { HomeViewModel() }
}