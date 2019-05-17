package com.sun.data.remote.api

import com.google.gson.JsonObject
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface GenreApi {
    @GET("movie/{genre}")
    fun getMoviesFromGenre(
        @Path("genre") genre: String,
        @Query("page") page: Int
    ): Single<JsonObject>
}