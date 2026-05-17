package com.pdm0126.taller2_pdm.screens.restaurantList

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.pdm0126.taller2_pdm.componentes.TopBar
import com.pdm0126.taller2_pdm.componentes.restaurantList.SectionCategory


@Composable
fun RestaurantListScreen(viewModel: RestaurantListViewModel, modifier: Modifier) {
    val groupedRestaurants by viewModel.restaurant.collectAsState()
    val isLoading by viewModel.loading.collectAsState()

    Scaffold() { paddingValues ->
        Column(modifier = Modifier.fillMaxSize().padding(paddingValues)) {
            TopBar(
                title = "FoodSpot",
                showSearchButton = true,
                onSearchClick = {}
            )
            LazyColumn(
                modifier = Modifier.fillMaxSize(),
                contentPadding = PaddingValues(bottom = 16.dp),
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                items(groupedRestaurants.keys.toList()) { categoryName ->
                    val restaurantList = groupedRestaurants[categoryName] ?: emptyList()

                    SectionCategory(
                        categoryName = categoryName,
                        restaurants = restaurantList
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun RestaurantListScreenPreview(){
    val mockViewModel = RestaurantListViewModel()
    RestaurantListScreen(mockViewModel, modifier = Modifier)
}
