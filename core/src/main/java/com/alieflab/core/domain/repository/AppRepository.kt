package com.alieflab.core.domain.repository

import com.alieflab.core.domain.model.News
import com.alieflab.core.domain.model.NewsDetail

interface AppRepository {
    suspend fun getContent(): List<NewsDetail>
}