package com.example.mycoffee.ui

import android.R
import androidx.compose.ui.res.stringResource
import androidx.lifecycle.ViewModel
import com.example.mycoffee.CoffeeScreen
import com.example.mycoffee.data.Coffee
import com.example.mycoffee.data.DataSource

data class CoffeeUiModel(
    val coffeeList: Coffee,
    val isFavorite: Boolean
)

class CoffeeViewModel : ViewModel() {
    private val coffeeList = DataSource.coffeeList

    fun getCoffeeByName(name: String): Coffee?{
        return coffeeList.find{ it.coffeeStr == name}
    }

    fun showDetail(){

    }

    fun setFavorite(favoriteCoffee:Coffee) {

    }

    fun pickTodayCoffee(todayCoffee:Coffee){

    }


}