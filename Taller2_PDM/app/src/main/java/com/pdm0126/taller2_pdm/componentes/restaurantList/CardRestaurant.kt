package com.pdm0126.taller2_pdm.componentes.restaurantList

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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil3.compose.AsyncImage
import com.pdm0126.taller2_pdm.model.Dish
import com.pdm0126.taller2_pdm.model.Restaurant
import com.pdm0126.taller2_pdm.ui.theme.Taller2_PDMTheme

@Composable
fun CardRestaurant(restaurant: Restaurant) {
    Card(modifier = Modifier.size(150.dp, 155.dp)) {
        Column(
            modifier = Modifier.padding(10.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            AsyncImage(
                model = restaurant.imageUrl,
                contentDescription = "",
                modifier = Modifier.size(130.dp, 90.dp).padding(bottom = 5.dp)
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

@Preview(showBackground = true)
@Composable
fun CardPreview() {
    Taller2_PDMTheme {
        CardRestaurant(
            restaurant = Restaurant(
                id = 1,
                name = "Burgers La Carnosa",
                review = 4.5f,
                description = "Las mejores hamburguesas artesanales de la ciudad.",
                imageUrl = "https://images.unsplash.com/photo-1550547660-d9450f859349?q=80&amp;w=930&amp;auto=format&amp;fit=crop&amp;ixlib=rb-4.1.0&amp;ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D",
                categories = listOf("Comida rápida", "Comida americana"),
                menu = listOf(
                    Dish(
                        id = 1,
                        name = "Cheeseburger clásica",
                        description = "Hamburguesa con queso cheddar, lechuga, tomate y salsa de la casa.",
                        imageUrl = "https://images.unsplash.com/photo-1508736793122-f516e3ba5569?q=80&w=686&auto=format&fit=crop&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"
                    ),
                    Dish(
                        id = 2,
                        name = "Hamburguesa Bacon BBQ",
                        description = "Crujiente tocino, aros de cebolla y nuestra salsa BBQ especial.",
                        imageUrl = "https://plus.unsplash.com/premium_photo-1667682209336-9079678199d8?q=80&w=687&auto=format&fit=crop&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"
                    ),
                    Dish(
                        id = 3,
                        name = "Loaded fries",
                        description = "Papas fritas con aceite de trufa y queso cheddar",
                        imageUrl = "https://images.unsplash.com/photo-1609530127564-bee93ebe1c9e?q=80&w=1170&auto=format&fit=crop&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"
                    )
                )
            )
        )
    }
}
