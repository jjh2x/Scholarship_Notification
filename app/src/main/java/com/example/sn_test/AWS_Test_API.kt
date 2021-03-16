package com.example.sn_test

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface AWS_Test_API {
    @GET("/scholarship")
    fun getScholarshipInformation(

    ): Call<List<ResultGetScholarshipInformation>>
}