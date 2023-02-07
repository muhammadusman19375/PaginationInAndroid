package com.example.firstapplication.api

import com.example.firstapplication.model.QuotesResponseModel
import retrofit2.http.GET
import retrofit2.http.Query

interface QuoteApi {

    @GET("/quotes")
    suspend fun getQuotes(@Query("page") page: Int): QuotesResponseModel

}