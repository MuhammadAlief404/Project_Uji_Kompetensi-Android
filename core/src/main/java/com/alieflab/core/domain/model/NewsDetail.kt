package com.alieflab.core.domain.model

data class NewsDetail(
    val created_at: String,
    val deleted_at: Any,
    val foto: String,
    val headline: Int,
    val id: Int,
    val id_kategori: Int,
    val id_operator: Int,
    val isi: String,
    val judul: String,
    val komentar: Int,
    val preview: String,
    val show: Int,
    val slug: String,
    val status: Int,
    val sumber: Any,
    val sumber_foto: String,
    val updated_at: String,
    val uuid: String,
    val view: Int
)