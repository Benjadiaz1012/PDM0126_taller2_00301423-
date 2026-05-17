package com.pdm0126.pdm_taller2_00301423.screens.DetailRestaurant

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.pdm0126.pdm_taller2_00301423.data.repositories.RestaurantRepository.RestaurantApiRepository
import com.pdm0126.pdm_taller2_00301423.data.repositories.RestaurantRepository.RestaurantRepository
import com.pdm0126.pdm_taller2_00301423.model.Restaurant
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class DetailRestaurantViewModel : ViewModel() {
    private val restaurantRepository: RestaurantRepository = RestaurantApiRepository()

    private val _restaurant = MutableStateFlow<Restaurant?>(null)
    val restaurant = _restaurant.asStateFlow()

    fun loadRestaurant(id: Int) {
        viewModelScope.launch {
            _restaurant.value = restaurantRepository.getRestaurantById(id)
        }
    }
}