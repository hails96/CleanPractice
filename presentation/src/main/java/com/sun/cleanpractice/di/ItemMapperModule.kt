package com.sun.cleanpractice.di

import com.sun.cleanpractice.model.MovieItemMapper
import org.koin.dsl.module.module
import org.koin.experimental.builder.single

val itemMapperModule = module(override = true) {
    single<MovieItemMapper>()
}