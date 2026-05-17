package com.pdm0126.pdm_taller2_00301423.screens.ListRestaurant

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.pdm0126.pdm_taller2_00301423.data.repositories.RestaurantRepository.RestaurantApiRepository
import com.pdm0126.pdm_taller2_00301423.data.repositories.RestaurantRepository.RestaurantRepository
import com.pdm0126.pdm_taller2_00301423.model.Restaurant
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class ListRestaurantViewModel : ViewModel(){
    private val restaurantRepository: RestaurantRepository = RestaurantApiRepository()
    private val _restaurants = MutableStateFlow<List<Restaurant>>(emptyList())
    val restaurants = _restaurants.asStateFlow()

    init {
    loadResturants()
    }
    fun loadResturants(){
        viewModelScope.launch {
            _restaurants.value = restaurantRepository.getResturants()
        }
    }
}