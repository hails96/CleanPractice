package com.sun.domain.model

import com.sun.domain.model.base.Model

data class Movie(
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
) : Model()