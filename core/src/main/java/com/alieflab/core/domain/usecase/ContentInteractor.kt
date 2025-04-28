package com.alieflab.core.domain.usecase

import com.alieflab.core.domain.model.News
import com.alieflab.core.domain.model.NewsDetail
import com.alieflab.core.domain.repository.AppRepository
import com.alieflab.core.util.Resource
import javax.inject.Inject

class ContentInteractor @Inject constructor(
    private val repository: AppRepository
) : ContentUseCase {
    override suspend fun getContent(): Resource<List<NewsDetail>> {
        return try {
            val content = repository.getContent()
            Resource.Success(content)
        } catch (e: Exception) {
            Resource.Error(e.message.toString())
        }
    }
}