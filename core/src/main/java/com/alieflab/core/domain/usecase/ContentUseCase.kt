package com.alieflab.core.domain.usecase

import com.alieflab.core.domain.model.News
import com.alieflab.core.domain.model.NewsDetail
import com.alieflab.core.util.Resource

interface ContentUseCase {
    suspend fun getContent(): Resource<List<NewsDetail>>
}