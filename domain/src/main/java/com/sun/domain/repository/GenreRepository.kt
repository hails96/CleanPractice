package com.sun.domain.repository

import com.sun.domain.model.Movie
import com.sun.domain.repository.base.Repository
import io.reactivex.Single

interface GenreRepository : Repository {

    fun getMovieFromGenre(genre: String, page: Int): Single<List<Movie>>

}