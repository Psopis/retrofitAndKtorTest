package com.example.ktorappservice

import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.http.GET

interface PhotosApi {
    @GET("/xyz")
    fun  getCoordintes(): Call<Post>



}