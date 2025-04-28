package com.alieflab.core.data.source.remote.network

import com.alieflab.core.data.source.remote.response.NewsResponse
import retrofit2.http.GET

interface AppAPI {

    @GET("berita_ppid")
    suspend fun getBerita(
    ): NewsResponse
}