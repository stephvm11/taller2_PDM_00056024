package com.pdm0126.taller2_pdm.componentes.restaurantList

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.pdm0126.taller2_pdm.model.Restaurant
import androidx.compose.foundation.lazy.items
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.pdm0126.taller2_pdm.ui.theme.Taller2_PDMTheme

@Composable
fun SectionCategory(
    categoryName: String,
    restaurants: List<Restaurant>,
    onRestaurantClick: (Int) -> Unit
) {
    Column(modifier = Modifier.padding(10.dp)) {
        Text(
            text = categoryName,
            fontWeight = FontWeight.Bold,
            fontSize = 17.sp
        )
        Spacer(Modifier.height(10.dp))

        LazyRow(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(12.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            items(restaurants) { itemRestaurant ->
                CardRestaurant(
                    restaurant = itemRestaurant,
                    onRestaurantClick = { id -> onRestaurantClick(id) })
            }
        }
    }
}