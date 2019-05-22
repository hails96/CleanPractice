package com.sun.data.di

import com.sun.data.model.MovieEntityMapper
import org.koin.dsl.module
import org.koin.experimental.builder.single

val entityMapperModule = module(override = true) {
    single<MovieEntityMapper>()
}