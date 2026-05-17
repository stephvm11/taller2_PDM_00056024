package com.pdm0126.taller2_pdm

import android.widget.Toast
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.navigation3.runtime.entryProvider
import androidx.navigation3.runtime.rememberNavBackStack
import androidx.navigation3.ui.NavDisplay
import com.pdm0126.taller2_pdm.routes.Routes
import com.pdm0126.taller2_pdm.screens.restaurantDetail.RestaurantDetailScreen
import com.pdm0126.taller2_pdm.screens.restaurantDetail.RestaurantDetailViewModel
import com.pdm0126.taller2_pdm.screens.restaurantList.RestaurantListScreen
import com.pdm0126.taller2_pdm.screens.restaurantList.RestaurantListViewModel
import com.pdm0126.taller2_pdm.screens.restaurantSearch.RestaurantSearchScreen

@Composable
fun FoodSpotApp(modifier: Modifier = Modifier) {
    val backstack = rememberNavBackStack(Routes.Home)
    val context = LocalContext.current

    NavDisplay(backStack = backstack, onBack = {
        backstack.removeLastOrNull()
    }, entryProvider = entryProvider {
        entry<Routes.Home> {
            RestaurantListScreen(modifier = modifier, navigateToSearch = {}, onSearchClick = {
                backstack.add(
                    Routes.SearchRestaurant
                )
            }, navigateToDetail = { id ->
                backstack.add(
                    Routes.RestaurantDetail(restaurantId = id)
                )
            })
        }
        entry<Routes.RestaurantDetail> { key ->
            RestaurantDetailScreen(
                restaurantId = key.restaurantId,
                onBackClick = { backstack.removeLastOrNull() },
                onDishAdded = { name ->
                    Toast.makeText(context, "$name agregado al carrito", Toast.LENGTH_SHORT).show()
                })
        }
        entry<Routes.SearchRestaurant> {
            RestaurantSearchScreen(
                onBackClick = { backstack.removeLastOrNull() }, navigateToDetail = { id ->
                    backstack.add(Routes.RestaurantDetail(restaurantId = id))
                })

        }
    })

}