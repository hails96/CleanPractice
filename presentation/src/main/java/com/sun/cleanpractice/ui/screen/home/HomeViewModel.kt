package com.sun.cleanpractice.ui.screen.home

import com.sun.cleanpractice.ui.base.BaseViewModel
import com.sun.cleanpractice.utils.SingleLiveEvent

class HomeViewModel : BaseViewModel() {

    val genre = SingleLiveEvent<String>()

    fun onMovieGenreClick(genre: String) {
        this.genre.value = genre
    }
}
