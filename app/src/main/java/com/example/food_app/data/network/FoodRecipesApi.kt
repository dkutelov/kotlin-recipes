package com.example.food_app.data.network

import com.example.food_app.models.FoodRecipes
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.QueryMap

interface FoodRecipesApi {

    @GET("/recipes/complexSearch")
    suspend fun getRecipes(
        @QueryMap queries: Map<String, String>
    ) : Response<FoodRecipes>

}