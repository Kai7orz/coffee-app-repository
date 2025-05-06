package com.example.mycoffee.ui

import android.util.Log
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.mycoffee.data.Coffee
import androidx.compose.runtime.getValue
import com.example.mycoffee.data.DataSource

@Composable
fun CoffeeDetailScreen(
    modifier:Modifier = Modifier,
    onPrevButton: ()-> Unit,
    viewModel: CoffeeViewModel
){

    val coffeeUiState by viewModel.coffeeUiState.collectAsState()

    Log.d("MYTEST", coffeeUiState.selectedCoffee?.coffeeStr ?: "null")

    coffeeUiState.selectedCoffee?.let{
        coffee ->
        Text( text = "${coffee.coffeeStr}")
    } ?: Text( text = "no selected")

    Button(
        onClick= onPrevButton
    ){

    }

}
