package com.sun.domain.usecase.genre

import com.sun.domain.Constants
import com.sun.domain.model.Movie
import com.sun.domain.repository.GenreRepository
import com.sun.domain.usecase.UseCase
import io.reactivex.Single

open class GenreDetailUseCase constructor(
    private val genreRepository: GenreRepository
) : UseCase<GenreDetailUseCase.Params?, Single<List<Movie>>>() {

    override fun onCleared() {
        // If you want to subscribe in UseCase
        // Please unsubscribe it here
    }

    override fun createObservable(params: Params?): Single<List<Movie>> {
        params?.apply {
            return genreRepository.getMovieFromGenre(genre, page)
        }
        return Single.error(Throwable(Constants.PARAMS_ERROR))
    }

    data class Params(val genre: String, val page: Int)
}