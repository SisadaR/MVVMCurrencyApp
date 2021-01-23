package com.sisada.mvvmcurrencyapp.data

import com.sisada.mvvmcurrencyapp.data.models.CurrencyResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface CurrencyApi {
    @GET("/latest")
    suspend fun getRates(
        @Query("base") base: String
    ): Response<CurrencyResponse>
}