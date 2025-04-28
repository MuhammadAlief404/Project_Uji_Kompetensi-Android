 package com.alieflab.core.data.source.remote

 import com.alieflab.core.data.source.remote.response.NewsResponse

 interface RemoteDataSource {
    suspend fun getContent(): NewsResponse
}