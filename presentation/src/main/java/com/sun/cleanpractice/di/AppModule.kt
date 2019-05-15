package com.sun.cleanpractice.di

import com.sun.cleanpractice.rx.AppSchedulerProvider
import com.sun.cleanpractice.rx.SchedulerProvider
import org.koin.android.ext.koin.androidApplication
import org.koin.dsl.module.module

val appModule = module {
    single { androidApplication().resources }
    single<SchedulerProvider> { AppSchedulerProvider() }
}