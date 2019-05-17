package com.sun.domain.di

import com.sun.domain.usecase.genre.GenreDetailUseCase
import org.koin.dsl.module.module
import org.koin.experimental.builder.single

val useCaseModule = module {
    single<GenreDetailUseCase>()
}