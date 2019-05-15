package com.sun.cleanpractice

import android.app.Application
import com.sun.cleanpractice.di.appModule
import com.sun.cleanpractice.di.itemMapperModule
import com.sun.cleanpractice.di.viewModelModule
import com.sun.data.di.entityMapperModule
import com.sun.data.di.networkModule
import com.sun.data.di.repositoryModule
import com.sun.domain.di.useCaseModule
import org.koin.android.ext.android.startKoin

class MainApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin(
            this,
            listOf(
                entityMapperModule,
                networkModule,
                repositoryModule,
                useCaseModule,
                appModule,
                itemMapperModule,
                viewModelModule
            )
        )
    }
}