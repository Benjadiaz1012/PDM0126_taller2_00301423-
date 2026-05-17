package com.pdm0126.pdm_taller2_00301423.screens.SearchRestaurant

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.pdm0126.pdm_taller2_00301423.data.repositories.RestaurantRepository.RestaurantApiRepository
import com.pdm0126.pdm_taller2_00301423.data.repositories.RestaurantRepository.RestaurantRepository
import com.pdm0126.pdm_taller2_00301423.model.Restaurant
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class SearchRestaurantViewModel : ViewModel() {

    private val restaurantRepository: RestaurantRepository = RestaurantApiRepository()

    private val _query = MutableStateFlow("")
    val query = _query.asStateFlow()

    private val _restaurants = MutableStateFlow<List<Restaurant>>(emptyList())
    val restaurants = _restaurants.asStateFlow()

    init {
        loadRestaurants()
    }

    private fun loadRestaurants() {
        viewModelScope.launch {
            _restaurants.value = restaurantRepository.getResturants()
        }
    }

    fun onQueryChange(value: String) {
        _query.value = value
    }

    fun getFilteredRestaurants(): List<Restaurant> {
        val text = _query.value.trim()

        if (text.isEmpty()) {
            return emptyList()
        }

        return _restaurants.value.filter { restaurant ->
            restaurant.name.contains(text, ignoreCase = true) ||
                    restaurant.menu.any { dish ->
                        dish.name.contains(text, ignoreCase = true)
                    }
        }
    }
}