package com.example.fetchapi.api

import com.example.fetchapi.ResponseMorty
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("character")
    fun getMorty() : Call <ResponseMorty>
}