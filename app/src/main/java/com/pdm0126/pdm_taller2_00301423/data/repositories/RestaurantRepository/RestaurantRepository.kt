package com.pdm0126.pdm_taller2_00301423.data.repositories.RestaurantRepository

import com.pdm0126.pdm_taller2_00301423.model.Restaurant

interface RestaurantRepository {
    suspend fun getResturants(): List<Restaurant>
    suspend fun getRestaurantById(id: Int): Restaurant?
}