package com.pdm0126.taller2_pdm.screens.restaurantSearch

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.pdm0126.taller2_pdm.componentes.TopBar
import com.pdm0126.taller2_pdm.componentes.restaurantSearch.CardNoResults
import com.pdm0126.taller2_pdm.componentes.restaurantSearch.CardResults
import com.pdm0126.taller2_pdm.componentes.restaurantSearch.SearchBar
import androidx.compose.foundation.lazy.items

@Composable
fun RestaurantSearchScreen(
    onBackClick: () -> Unit,
    navigateToDetail: (Int) -> Unit,
    viewModel: RestaurantSearchViewModel = viewModel()
) {
    val search by viewModel.searchedValue.collectAsState()
    val results by viewModel.restaurantsSearched.collectAsState()

    Scaffold() { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues).padding(15.dp)
        ) {
            TopBar(
                title = "Buscar",
                showBackButton = true,
                onBackClick = { onBackClick() }
            )
            Spacer(modifier = Modifier.height(5.dp))

            SearchBar(
                search = search,
                onSearchChange = { text -> viewModel.onSearchValueChanged(text) })

            Spacer(modifier = Modifier.height(15.dp))

            if (search.isNotEmpty() && results.isEmpty()) {
                CardNoResults()
            } else {
                LazyColumn(
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.spacedBy(15.dp)
                ) {
                    if (search.isNotEmpty() && results.isNotEmpty()) {
                        item {
                            Text(
                                text = "${results.size} resultados encontrados",
                                fontWeight = FontWeight.SemiBold,
                                color = Color.DarkGray,
                                modifier = Modifier.padding(bottom = 5.dp)
                            )
                        }
                    }
                    items(results) { restaurant ->
                        CardResults(
                            restaurant = restaurant,
                            onRestaurantClick = { id -> navigateToDetail(id) })
                    }
                }
            }
        }


    }


}