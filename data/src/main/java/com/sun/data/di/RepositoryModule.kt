package com.sun.data.di

import android.content.Context
import androidx.room.Room
import com.google.gson.Gson
import com.sun.data.Constants
import com.sun.data.local.db.AppDatabase
import com.sun.data.local.pref.AppPrefs
import com.sun.data.local.pref.PrefHelper
import org.koin.dsl.module

val repositoryModule = module {
    single { createDatabaseName() }
    single { createAppDatabase(get(), get()) }
    single<PrefHelper> { AppPrefs(get(), get()) }
    single { Gson() }
}

fun createDatabaseName() = Constants.DATABASE_NAME

fun createAppDatabase(dbName: String, context: Context) =
    Room.databaseBuilder(context, AppDatabase::class.java, dbName).build()
