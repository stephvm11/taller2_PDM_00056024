package com.pdm0126.taller2_pdm.screens.restaurantDetail

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.pdm0126.taller2_pdm.data.repositories.RestaurantApiRepository
import com.pdm0126.taller2_pdm.data.repositories.RestaurantRepository
import com.pdm0126.taller2_pdm.model.Restaurant
import kotlinx.coroutines.launch

class RestaurantDetailViewModel(
    private val repository: RestaurantRepository = RestaurantApiRepository()
) : ViewModel() {
    private val _restaurant = mutableStateOf<Restaurant?>(null)
    val restaurant = _restaurant

    fun loadRestaurant(id: Int) {
        viewModelScope.launch {
            _restaurant.value = repository.getRestaurantById(id)
        }

    }
}