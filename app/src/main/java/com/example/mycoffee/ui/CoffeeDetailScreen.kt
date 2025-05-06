package com.example.mycoffee.ui

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.mycoffee.data.Coffee
import com.example.mycoffee.data.DataSource

@Composable
fun CoffeeDetailScreen(
    modifier:Modifier = Modifier,
    coffeeName: String,
    onPrevButton: ()-> Unit
){
    val viewModel:CoffeeViewModel = viewModel()
    val  coffee:Coffee? = viewModel.getCoffeeByName(coffeeName)
    if(coffee!=null){
        Text(
            text = stringResource(id = coffee.coffeeNameId)
        )
        Button(
            modifier = Modifier,
            onClick = onPrevButton,
        ){

        }
    }
}