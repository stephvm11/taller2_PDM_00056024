package com.pdm0126.taller2_pdm.data.repositories

import com.pdm0126.taller2_pdm.model.Restaurant

interface RestaurantRepository{
    suspend fun getRestaurants(): List<Restaurant>
    suspend fun getCategories() : List<String>
    suspend fun getRestaurantByCategory(): Map<String, List<Restaurant>>
}