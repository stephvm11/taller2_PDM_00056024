package com.pdm0126.taller2_pdm.screens.restaurantDetail

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.pdm0126.taller2_pdm.componentes.TopBar
import com.pdm0126.taller2_pdm.componentes.restaurantDetail.CardDish

@Composable
fun RestaurantDetailScreen(
    restaurantId: Int,
    onBackClick: () -> Unit,
    onDishAdded: (String) -> Unit,
    viewModel: RestaurantDetailViewModel = viewModel()
) {
    val restaurant by viewModel.restaurant

    LaunchedEffect(key1 = restaurantId) {
        viewModel.loadRestaurant(restaurantId)
    }
    Scaffold() { paddingValues ->
        Column(modifier = Modifier
            .fillMaxSize()
            .padding(paddingValues).padding(10.dp)) {
            restaurant?.let { currentRestaurant ->
                TopBar(
                    title = currentRestaurant.name,
                    showBackButton = true,
                    onBackClick = onBackClick
                )
                Spacer(modifier = Modifier.height(5.dp))

                LazyColumn(
                    modifier = Modifier.fillMaxSize().padding(top = 15.dp, bottom = 15.dp),
                    contentPadding = PaddingValues(10.dp)
                ) {
                    item {
                        Text(
                            text = currentRestaurant.description,
                            fontSize = 15.sp,
                            color = Color.Gray
                        )
                        Spacer(modifier = Modifier.height(10.dp))
                    }
                    items(currentRestaurant.menu) { dish ->
                        CardDish(
                            dish = dish,
                            onAddClick = {
                                onDishAdded(dish.name)
                            }
                        )

                        Spacer(modifier = Modifier.height(15.dp))
                    }
                }
            }
        }
    }
}
