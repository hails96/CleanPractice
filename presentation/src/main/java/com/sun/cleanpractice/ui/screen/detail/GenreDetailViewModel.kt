package com.sun.cleanpractice.ui.screen.detail

import androidx.lifecycle.MutableLiveData
import com.sun.cleanpractice.model.MovieItem
import com.sun.cleanpractice.model.MovieItemMapper
import com.sun.cleanpractice.rx.SchedulerProvider
import com.sun.cleanpractice.ui.base.BaseViewModel
import com.sun.domain.usecase.genre.GenreDetailUseCase

class GenreDetailViewModel(
    private val genreDetailUseCase: GenreDetailUseCase,
    private val schedulerProvider: SchedulerProvider,
    private val movieItemMapper: MovieItemMapper
) : BaseViewModel() {

    val movies = MutableLiveData<List<MovieItem>>()

    private var page = 1

    fun getMovieFromGenre(genre: String) {
        isLoading.value = true
        compositeDisposable.add(
            genreDetailUseCase.createObservable(GenreDetailUseCase.Params(genre, page))
                .subscribeOn(schedulerProvider.io())
                .observeOn(schedulerProvider.ui())
                .map { list ->
                    list.map { movieItemMapper.mapToPresentation(it) }
                }
                .subscribe({
                    isLoading.value = false
                    movies.value = it
                }, {
                    isLoading.value = false
                    errorMessage.value = it.message
                })
        )
    }
}
