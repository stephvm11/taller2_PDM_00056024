package com.pdm0126.taller2_pdm.model

data class Restaurant(
    val id: Int,
    val name: String,
    val review: Float,
    val description: String,
    val imageUrl: String,
    val categories: List<String>,
    val menu: List<Dish>
) {
    val category: Any
}
