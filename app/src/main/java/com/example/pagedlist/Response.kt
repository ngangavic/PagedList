package com.example.pagedlist

import com.google.gson.annotations.SerializedName

data class Response (
    @SerializedName("articles") val news: List<News>
)