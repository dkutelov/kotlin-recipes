package com.example.food_app.data

import com.example.food_app.data.network.FoodRecipesApi
import com.example.food_app.models.FoodRecipes
import retrofit2.Response
import javax.inject.Inject

class RemoteDataSource @Inject constructor(
    private val foodRecipesApi: FoodRecipesApi //will find the class based on the return type
) {

    suspend fun getRecipes(queries: Map<String, String>): Response<FoodRecipes> {
        return foodRecipesApi.getRecipes(queries)
    }
}