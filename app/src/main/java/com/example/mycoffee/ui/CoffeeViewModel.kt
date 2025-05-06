package com.example.mycoffee.ui

import android.R
import android.util.Log
import androidx.compose.ui.res.stringResource
import androidx.lifecycle.ViewModel
import com.example.mycoffee.CoffeeScreen
import com.example.mycoffee.data.Coffee
import com.example.mycoffee.data.DataSource
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update


class CoffeeViewModel : ViewModel() {
    private val coffeeList = DataSource.coffeeList
    private val _coffeeUiState = MutableStateFlow(CoffeeUiState())
    val coffeeUiState = _coffeeUiState

    fun getCoffeeByName(name: String): Coffee?{
        return coffeeList.find{ it.coffeeStr == name}
    }

    fun onDetailButton(CoffeeName: String){
//        _coffeeUiState.update{ it.copy( selectedCoffee = getCoffeeByName(CoffeeName))}
        _coffeeUiState.value = _coffeeUiState.value.copy(selectedCoffee = getCoffeeByName(CoffeeName))
    }

    fun showDetail(){

    }

    fun setFavorite(favoriteCoffee:Coffee) {

    }

    fun pickTodayCoffee(todayCoffee:Coffee){

    }


}