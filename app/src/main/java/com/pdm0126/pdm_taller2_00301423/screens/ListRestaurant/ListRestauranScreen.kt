package com.pdm0126.pdm_taller2_00301423.screens.ListRestaurant

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import coil3.compose.AsyncImage
import com.pdm0126.pdm_taller2_00301423.model.Restaurant

@Composable
fun ListRestaurantScreen(
    onRestaurantClick: (Int) -> Unit,
    onSearchClick: () -> Unit,
    viewModel: ListRestaurantViewModel = viewModel()
) {
    val restaurants by viewModel.restaurants.collectAsState()
    var searchText by remember { mutableStateOf("") }

    val groupedRestaurants = restaurants
        .flatMap { restaurant ->
            restaurant.categories.map { category -> category to restaurant }
        }
        .groupBy({ it.first }, { it.second })

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        SearchBar(
            value = searchText,
            onValueChange = { searchText = it },
            onSearchClick = onSearchClick
        )

        LazyColumn(
            verticalArrangement = Arrangement.spacedBy(20.dp)
        ) {
            groupedRestaurants.forEach { (category, restaurantsByCategory) ->
                item {
                    Text(
                        text = category,
                        fontWeight = FontWeight.Bold
                    )

                    Spacer(modifier = Modifier.height(8.dp))

                    LazyRow(
                        horizontalArrangement = Arrangement.spacedBy(12.dp)
                    ) {
                        items(restaurantsByCategory) { restaurant ->
                            RestaurantCard(
                                restaurant = restaurant,
                                onClick = { onRestaurantClick(restaurant.id) }
                            )
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun SearchBar(
    value: String,
    onValueChange: (String) -> Unit,
    onSearchClick: () -> Unit
) {
    OutlinedTextField(
        value = value,
        onValueChange = onValueChange,
        placeholder = {
            Text("Buscar restaurantes o platillos...")
        },
        trailingIcon = {
            Text(
                text = "Buscar",
                modifier = Modifier.clickable {
                    onSearchClick()
                }
            )
        },
        singleLine = true,
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 24.dp, bottom = 20.dp)
    )
}

@Composable
fun RestaurantCard(
    restaurant: Restaurant,
    onClick: () -> Unit
) {
    Card(
        modifier = Modifier
            .width(110.dp)
            .clickable { onClick() }
    ) {
        Column(
            modifier = Modifier.padding(8.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            AsyncImage(
                model = restaurant.imageUrl,
                contentDescription = restaurant.name,
                modifier = Modifier.size(80.dp),
                contentScale = ContentScale.Crop
            )

            Text(
                text = restaurant.name,
                modifier = Modifier.padding(top = 8.dp)
            )
        }
    }
}