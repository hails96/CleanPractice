package com.sun.data

import com.google.gson.Gson
import com.sun.data.local.db.AppDatabase
import com.sun.data.local.pref.PrefHelper
import com.sun.data.model.MovieEntity
import com.sun.data.model.MovieEntityMapper
import com.sun.data.remote.api.GenreApi
import com.sun.domain.model.Movie
import com.sun.domain.repository.GenreRepository
import io.reactivex.Single

class GenreRepositoryImpl constructor(
    private val gson: Gson,
    private val genreApi: GenreApi,
    private val appDatabase: AppDatabase,
    private val prefHelper: PrefHelper,
    private val movieMapper: MovieEntityMapper
) : GenreRepository {

    override fun getMovieFromGenre(genre: String, page: Int): Single<List<Movie>> {
        return genreApi.getMoviesFromGenre(genre, page).map { list ->
            list.getAsJsonArray(Constants.KEY_RESULTS).map {
                movieMapper.mapToDomain(gson.fromJson(it, MovieEntity::class.java))
            }
        }
    }

}