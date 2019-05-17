package com.sun.data.model

import androidx.room.Entity
import com.google.gson.annotations.SerializedName
import com.sun.data.model.base.EntityMapper
import com.sun.data.model.base.ModelEntity
import com.sun.domain.model.Movie

@Entity(tableName = "movie", primaryKeys = ["id"])
data class MovieEntity(
    @field: SerializedName("id") val id: Int,
    @field: SerializedName("vote_count") val voteCount: String? = null,
    @field: SerializedName("video") val video: Boolean? = null,
    @field: SerializedName("vote_average") val voteAverage: Double? = null,
    @field: SerializedName("title") val title: String? = null,
    @field: SerializedName("popularity") val popularity: Double? = null,
    @field: SerializedName("poster_path") val posterPath: String? = null,
    @field: SerializedName("backdrop_path") val backdropPath: String? = null,
    @field: SerializedName("overview") val overview: String? = null,
    @field: SerializedName("release_date") val releaseDate: String? = null
) : ModelEntity()

class MovieEntityMapper : EntityMapper<Movie, MovieEntity> {
    override fun mapToDomain(entity: MovieEntity) = Movie(
        id = entity.id,
        voteCount = entity.voteCount,
        video = entity.video,
        voteAverage = entity.voteAverage,
        title = entity.title,
        popularity = entity.popularity,
        posterPath = entity.posterPath,
        backdropPath = entity.backdropPath,
        overview = entity.overview,
        releaseDate = entity.releaseDate
    )

    override fun mapToEntity(model: Movie) = MovieEntity(
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
}
