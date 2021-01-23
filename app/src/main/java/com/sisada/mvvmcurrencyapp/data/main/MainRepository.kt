package com.sisada.mvvmcurrencyapp.data.main

import com.sisada.mvvmcurrencyapp.data.models.CurrencyResponse
import com.sisada.mvvmcurrencyapp.data.util.Resource

interface MainRepository {
    suspend fun getRates(base:String): Resource<CurrencyResponse>
}