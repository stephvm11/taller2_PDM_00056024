package com.pdm0126.taller2_pdm.screens.restaurantList

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.pdm0126.taller2_pdm.data.repositories.RestaurantApiRepository
import com.pdm0126.taller2_pdm.data.repositories.RestaurantRepository
import com.pdm0126.taller2_pdm.model.Restaurant
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class RestaurantListViewModel : ViewModel() {
    private val restaurantRepository: RestaurantRepository = RestaurantApiRepository()

    private val _restaurant = MutableStateFlow<Map<String, List<Restaurant>>>(emptyMap())
    val restaurant = _restaurant.asStateFlow()

    private val _loading = MutableStateFlow<Boolean>(false)
    val loading = _loading.asStateFlow()

    init {
        loadResturants()
    }

    fun loadResturants() {
        viewModelScope.launch {
            _restaurant.value = restaurantRepository.getRestaurantByCategory()
        }
    }
}