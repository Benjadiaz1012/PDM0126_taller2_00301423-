package com.pdm0126.pdm_taller2_00301423.data.repositories.RestaurantRepository

import com.pdm0126.pdm_taller2_00301423.dummy.sampleRestaurants
import com.pdm0126.pdm_taller2_00301423.model.Restaurant

class RestaurantApiRepository : RestaurantRepository{
    override suspend fun getResturants(): List<Restaurant> {
        return sampleRestaurants
    }
    override suspend fun getRestaurantById(id: Int): Restaurant? {
        return sampleRestaurants.find { it.id == id }
    }
}