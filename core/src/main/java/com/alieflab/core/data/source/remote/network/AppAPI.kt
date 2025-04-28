package com.alieflab.core.data.source.remote.network

import com.alieflab.core.data.source.remote.response.NewsResponse

interface AppAPI {

    @GET("berita_ppid")
    suspend fun getBerita(
    ): NewsResponse
}