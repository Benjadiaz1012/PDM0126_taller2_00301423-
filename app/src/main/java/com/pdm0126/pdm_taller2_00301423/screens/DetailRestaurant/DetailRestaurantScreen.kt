package com.pdm0126.pdm_taller2_00301423.screens.DetailRestaurant

import android.widget.Toast
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.pdm0126.pdm_taller2_00301423.components.DishCard

@Composable
fun DetailRestaurantScreen(
    restaurantId: Int,
    onBackClick: () -> Unit,
    viewModel: DetailRestaurantViewModel = viewModel()
) {
    val context = LocalContext.current
    val restaurant by viewModel.restaurant.collectAsState()

    LaunchedEffect(restaurantId) {
        viewModel.loadRestaurant(restaurantId)
    }

    if (restaurant == null) {
        Text(
            text = "Cargando restaurante...",
            modifier = Modifier.padding(16.dp)
        )
        return
    }

    val selectedRestaurant = restaurant!!

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(top = 32.dp, bottom = 16.dp)
        ) {
            Text(
                text = "<",
                modifier = Modifier
                    .padding(end = 12.dp)
                    .clickable { onBackClick() }
            )

            Text(
                text = selectedRestaurant.name,
                fontWeight = FontWeight.Bold
            )
        }

        Text(text = selectedRestaurant.description)

        Spacer(modifier = Modifier.height(20.dp))

        LazyColumn(
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            items(selectedRestaurant.menu) { dish ->
                DishCard(
                    dish = dish,
                    onAddClick = {
                        Toast.makeText(
                            context,
                            "${dish.name} agregado al carrito",
                            Toast.LENGTH_SHORT
                        ).show()
                    }
                )
            }
        }
    }
}

