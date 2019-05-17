package com.sun.data.local.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.sun.data.model.MovieEntity

@Database(entities = [MovieEntity::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {

}