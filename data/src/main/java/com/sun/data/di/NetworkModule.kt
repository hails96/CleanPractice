package com.sun.data.di

import com.sun.data.BuildConfig
import com.sun.data.di.Properties.TIME_OUT
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.core.qualifier.named
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

val networkModule = module {
    single(named("logging")) { createLoggingInterceptor() }
    single(named("header")) { createHeaderInterceptor() }
    single { createOkHttpClient(getProperty(key = "logging"), getProperty(key = "header")) }
    single { createAppRetrofit(get()) }
}

object Properties {
    const val TIME_OUT = 10
}

fun createLoggingInterceptor(): Interceptor {
    val logging = HttpLoggingInterceptor()
    logging.level = if (BuildConfig.DEBUG) HttpLoggingInterceptor.Level.BODY
    else HttpLoggingInterceptor.Level.NONE
    return logging
}

fun createHeaderInterceptor(): Interceptor {
    return Interceptor { chain ->
        val request = chain.request()
        val newUrl = request.url().newBuilder()
//            .addQueryParameter("api_key", "")
                .build()
        val newRequest = request.newBuilder()
                .url(newUrl)
                .header("Content-Type", "application/json")
//            .header("Authorization", "")
                .method(request.method(), request.body())
                .build()
        chain.proceed(newRequest)
    }
}

fun createOkHttpClient(logging: Interceptor, header: Interceptor): OkHttpClient {
    return OkHttpClient.Builder()
            .connectTimeout(TIME_OUT.toLong(), TimeUnit.SECONDS)
            .readTimeout(TIME_OUT.toLong(), TimeUnit.SECONDS)
            .addInterceptor(logging)
            .addInterceptor(header)
            .build()
}

fun createAppRetrofit(okHttpClient: OkHttpClient): Retrofit {
    return Retrofit.Builder()
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(BuildConfig.BASE_URL)
            .client(okHttpClient)
            .build()
}