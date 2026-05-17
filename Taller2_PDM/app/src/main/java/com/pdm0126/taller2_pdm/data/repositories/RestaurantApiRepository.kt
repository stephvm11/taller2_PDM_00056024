package com.pdm0126.taller2_pdm.data.repositories

import com.pdm0126.taller2_pdm.data.dummyRestaurants
import com.pdm0126.taller2_pdm.model.Restaurant
import kotlinx.coroutines.delay

class RestaurantApiRepository : RestaurantRepository {
    private val uniqueCategories = dummyRestaurants.flatMap { it.categories}.distinct()

    private val groupedRestaurantsMap = uniqueCategories.associateWith { category->
    dummyRestaurants.filter { it.categories.contains(category) }}

    override suspend fun getRestaurants(): List<Restaurant> {
        return dummyRestaurants
    }

    override suspend fun getCategories(): List<String> {
        return uniqueCategories
    }

    override suspend fun getRestaurantByCategory(): Map<String, List<Restaurant>> {
        return groupedRestaurantsMap
    }

}
