package com.pdm0126.taller2_pdm.routes

import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable

sealed class Routes : NavKey {
    @Serializable
    data object Home: Routes()

    @Serializable
    data class RestaurantDetail(val restaurantId: Int) : Routes()
}