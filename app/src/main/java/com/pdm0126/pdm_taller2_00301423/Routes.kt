package com.pdm0126.pdm_taller2_00301423

import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable

sealed class Routes : NavKey {
    @Serializable
    data object Home : Routes() {

    }

    @Serializable
    data object Search : Routes()
    @Serializable
    data class Detail(
        val id: Int
    ) : Routes()
}