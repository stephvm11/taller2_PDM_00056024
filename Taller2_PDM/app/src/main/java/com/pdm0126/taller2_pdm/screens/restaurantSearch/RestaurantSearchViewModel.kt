package com.pdm0126.taller2_pdm.screens.restaurantSearch

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.pdm0126.taller2_pdm.data.repositories.RestaurantApiRepository
import com.pdm0126.taller2_pdm.data.repositories.RestaurantRepository
import com.pdm0126.taller2_pdm.model.Restaurant
import kotlinx.coroutines.Job
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class RestaurantSearchViewModel(private val repository: RestaurantRepository = RestaurantApiRepository()) :
    ViewModel() {
    private val _restaurantsSearched = MutableStateFlow<List<Restaurant>>(emptyList())
    val restaurantsSearched = _restaurantsSearched.asStateFlow()

    private val _searchedValue = MutableStateFlow("")
    val searchedValue = _searchedValue.asStateFlow()

    private var restaurantsList: List<Restaurant> = emptyList()

    private var searchJob: Job? = null

    fun loadResearch() {
        viewModelScope.launch {
            restaurantsList = repository.getRestaurants()
        }

    }




}