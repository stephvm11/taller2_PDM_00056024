package com.pdm0126.taller2_pdm.componentes.restaurantList

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil3.compose.AsyncImage
import com.pdm0126.taller2_pdm.model.Dish
import com.pdm0126.taller2_pdm.model.Restaurant
import com.pdm0126.taller2_pdm.ui.theme.Taller2_PDMTheme

@Composable
fun CardRestaurant(
    restaurant: Restaurant,
    onRestaurantClick: (Int) -> Unit
) {
    Card(modifier = Modifier
        .size(150.dp, 155.dp)
        .clickable { onRestaurantClick(restaurant.id) }) {
        Column(
            modifier = Modifier.padding(10.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            AsyncImage(
                model = restaurant.imageUrl,
                contentDescription = "",
                modifier = Modifier
                    .size(130.dp, 90.dp)
                    .padding(bottom = 5.dp),
                contentScale = ContentScale.Crop
            )
            Text(
                text = restaurant.name,
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center,
                fontSize = 10.sp
            )
            Text(
                text = "✯ ${restaurant.review}",
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center,
                fontSize = 10.sp
            )

        }

    }

}
