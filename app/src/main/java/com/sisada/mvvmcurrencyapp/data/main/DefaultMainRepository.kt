package com.sisada.mvvmcurrencyapp.data.main

import com.sisada.mvvmcurrencyapp.data.CurrencyApi
import com.sisada.mvvmcurrencyapp.data.models.CurrencyResponse
import com.sisada.mvvmcurrencyapp.data.util.Resource
import java.lang.Exception
import javax.inject.Inject

class DefaultMainRepository @Inject constructor(
    private  val  api: CurrencyApi
): MainRepository {
    override suspend fun getRates(base: String): Resource<CurrencyResponse> {
        try {
            val response = api.getRates(base)
            val result = response.body()
            if(response.isSuccessful && result != null){
                return Resource.Success(result)
            }
            else
            {
                return Resource.Error(response.message())
            }

        } catch (e: Exception){
            return Resource.Error(e.message ?: "An error occurred")
        }
    }
}