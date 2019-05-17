package com.sun.cleanpractice.di

import com.sun.cleanpractice.ui.screen.genredetail.GenreDetailViewModel
import com.sun.cleanpractice.ui.screen.favorite.FavoriteViewModel
import com.sun.cleanpractice.ui.screen.home.HomeViewModel
import com.sun.cleanpractice.ui.screen.main.MainViewModel
import com.sun.cleanpractice.ui.screen.navigation.NavigationViewModel
import com.sun.cleanpractice.ui.screen.search.SearchViewModel
import org.koin.androidx.viewmodel.ext.koin.viewModel
import org.koin.dsl.module.module

val viewModelModule = module {
    viewModel { MainViewModel() }
    viewModel { NavigationViewModel() }
    viewModel { HomeViewModel() }
    viewModel { SearchViewModel() }
    viewModel { FavoriteViewModel() }
    viewModel { GenreDetailViewModel(get(), get(), get()) }
}