package com.example.newsapp.data.model

data class NewsResult(

    val status: String,
    val totalResults: Int,
    val articles: List<Articles>

)