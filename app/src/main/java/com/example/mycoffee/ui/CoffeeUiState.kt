package com.example.mycoffee.ui

import com.example.mycoffee.data.Coffee

data class CoffeeUiState(
    val userFavoriteCoffee: List<Coffee>? = null,
    val selectedCoffee: Coffee? = null
)