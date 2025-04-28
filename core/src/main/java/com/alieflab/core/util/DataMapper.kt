package com.alieflab.core.util

import com.alieflab.core.data.source.remote.response.NewsDataResponse
import com.alieflab.core.data.source.remote.response.NewsResponse
import com.alieflab.core.domain.model.News
import com.alieflab.core.domain.model.NewsDetail

object DataMapper {

    fun contentNewsListToDomain(newsList: NewsResponse): List<NewsDetail> {
        return newsList.data.map {
            contentResponseToDomain(it)
        }
    }

    fun contentResponseToDomain(contentResult: NewsDataResponse): NewsDetail {
        return NewsDetail(
            created_at =contentResult.created_at ,
            deleted_at =contentResult.deleted_at ,
            foto =contentResult.foto ,
            headline =contentResult.headline ,
            id =contentResult.id ,
            id_kategori =contentResult.id_kategori ,
            id_operator =contentResult.id_operator ,
            isi =contentResult.isi ,
            judul =contentResult.judul ,
            komentar =contentResult.komentar ,
            preview =contentResult.preview ,
            show =contentResult.show ,
            slug =contentResult.slug ,
            status =contentResult.status ,
            sumber =contentResult.sumber ,
            sumber_foto =contentResult.sumber_foto ,
            updated_at =contentResult.updated_at ,
            uuid =contentResult.uuid ,
            view = contentResult.view ,
        )
    }

}