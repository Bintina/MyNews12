package com.example.mynews12.model.topnews


import com.google.gson.annotations.SerializedName


data class NewsResponse(
    @SerializedName("copyright")
    val copyright: String?,
    @SerializedName("last_updated")
    val lastUpdated: String?,
    @SerializedName("num_results")
    val numResults: Int?,
    @SerializedName("results")
    val results: List<NewsResult?>?,
    @SerializedName("section")
    val section: String?,
    @SerializedName("status")
    val status: String?
)