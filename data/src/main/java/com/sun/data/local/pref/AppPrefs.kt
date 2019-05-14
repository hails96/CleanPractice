package com.sun.data.local.pref

import android.content.Context
import com.google.gson.Gson

class AppPrefs constructor(context: Context, val gson: Gson) : PrefHelper {

    companion object {

    }

    private var sharedPreferences = context.getSharedPreferences(context.packageName, Context.MODE_PRIVATE)

    override fun clear() {
        sharedPreferences.edit().clear().apply()
    }

}