 package com.alieflab.core.data.source.remote

 import com.alieflab.core.data.source.remote.network.AppAPI
 import com.alieflab.core.data.source.remote.response.NewsResponse
 import javax.inject.Inject
 import javax.inject.Singleton

 @Singleton
class RemoteDataSourceImpl @Inject constructor(
    private val apiService: AppAPI
): RemoteDataSource {

    override suspend fun getContent(): NewsResponse {
        return apiService.getBerita()
    }
}