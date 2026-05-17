package com.pdm0126.pdm_taller2_00301423

import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.entryProvider
import androidx.navigation3.runtime.rememberNavBackStack
import androidx.navigation3.ui.NavDisplay
import com.pdm0126.pdm_taller2_00301423.screens.DetailRestaurant.DetailRestaurantScreen
import com.pdm0126.pdm_taller2_00301423.screens.ListRestaurant.ListRestaurantScreen
import com.pdm0126.pdm_taller2_00301423.screens.SearchRestaurant.SearchRestaurantScreen

@Composable
fun RestaurantApp() {
    val backStack = rememberNavBackStack(Routes.Home)
    NavDisplay(
        backStack = backStack,
        onBack = { backStack.removeLastOrNull() },
        entryProvider = entryProvider {
            entry<Routes.Home> {
                ListRestaurantScreen(
                    onRestaurantClick = { id ->
                        backStack.add(Routes.Detail(id))
                    },
                    onSearchClick = {
                        backStack.add(Routes.Search)
                    }
                )
            }
            entry<Routes.Search> {
                SearchRestaurantScreen(
                    onRestaurantClick = { id ->
                        backStack.add(Routes.Detail(id))
                    },
                    onBackClick = {
                        backStack.removeLastOrNull()
                    }
                )
            }
            entry<Routes.Detail> { route ->
                DetailRestaurantScreen(
                    restaurantId = route.id,
                    onBackClick = {
                        backStack.removeLastOrNull()
                    }
                )
            }
        }
    )
}