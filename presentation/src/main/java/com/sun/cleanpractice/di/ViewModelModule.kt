package com.sun.cleanpractice.di

import com.sun.cleanpractice.ui.screen.main.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel { MainViewModel() }
}