package com.alieflab.core.domain.model

import com.alieflab.core.data.source.remote.response.NewsDataResponse

data class News(
    val current_page: Int,
    val `data`: List<NewsDetail>,
    val first_page_url: String,
    val from: Int,
    val last_page: Int,
    val last_page_url: String,
    val next_page_url: String,
    val path: String,
    val per_page: Int,
    val prev_page_url: Any,
    val to: Int,
    val total: Int
)