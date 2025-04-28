package com.alieflab.core.data.source

import com.alieflab.core.data.source.remote.RemoteDataSource
import com.alieflab.core.domain.model.NewsDetail
import com.alieflab.core.domain.repository.AppRepository
import com.alieflab.core.util.DataMapper
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class AppRepositoryImpl @Inject constructor(
    private val remoteDataSource: RemoteDataSource
) : AppRepository {

    override suspend fun getContent(): List<NewsDetail> {
        return DataMapper.contentNewsListToDomain(remoteDataSource.getContent())
    }
}