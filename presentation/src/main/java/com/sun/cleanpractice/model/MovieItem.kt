package com.sun.cleanpractice.model

import com.sun.cleanpractice.model.base.ItemMapper
import com.sun.cleanpractice.model.base.ModelItem
import com.sun.domain.model.Movie

data class MovieItem(
    val id: Int,
    val voteCount: String? = null,
    val video: Boolean? = null,
    val voteAverage: Double? = null,
    val title: String? = null,
    val popularity: Double? = null,
    val posterPath: String? = null,
    val backdropPath: String? = null,
    val overview: String? = null,
    val releaseDate: String? = null
) : ModelItem()

class MovieItemMapper : ItemMapper<Movie, MovieItem> {
    override fun mapToPresentation(model: Movie) = MovieItem(
        id = model.id,
        voteCount = model.voteCount,
        video = model.video,
        voteAverage = model.voteAverage,
        title = model.title,
        popularity = model.popularity,
        posterPath = model.posterPath,
        backdropPath = model.backdropPath,
        overview = model.overview,
        releaseDate = model.releaseDate
    )

    override fun mapToDomain(modelItem: MovieItem) = Movie(
        id = modelItem.id,
        voteCount = modelItem.voteCount,
        video = modelItem.video,
        voteAverage = modelItem.voteAverage,
        title = modelItem.title,
        popularity = modelItem.popularity,
        posterPath = modelItem.posterPath,
        backdropPath = modelItem.backdropPath,
        overview = modelItem.overview,
        releaseDate = modelItem.releaseDate
    )
}