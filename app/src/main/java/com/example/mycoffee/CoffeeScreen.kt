package com.example.mycoffee

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Yellow
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.mycoffee.data.DataSource
import com.example.mycoffee.ui.CoffeeDetailScreen
import com.example.mycoffee.ui.CoffeeListScreen
import com.example.mycoffee.ui.CoffeeViewModel


enum class CoffeeScreen(){
    Start,
    Detail,
    Favorite
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CoffeeApp(
    viewModel: CoffeeViewModel = viewModel(),
    modifier:Modifier = Modifier,
    navController: NavHostController = rememberNavController()
    ){

    Scaffold(
        topBar={
            TopAppBar(
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer,
                    titleContentColor = MaterialTheme.colorScheme.onPrimary,
                    navigationIconContentColor = MaterialTheme.colorScheme.onPrimary,
                    actionIconContentColor = MaterialTheme.colorScheme.onSecondary
                ),
                title = { Text(stringResource(id = R.string.coffee_title)) },
            )
        }
    ){ innerPadding ->

        NavHost(
            navController = navController,
            startDestination = CoffeeScreen.Start.name,
            modifier = Modifier.padding(innerPadding)
        ){
            composable(route = CoffeeScreen.Start.name){
                CoffeeListScreen(
                    modifier=Modifier,
                    coffeeList = DataSource.coffeeList,
                    detailButton = {
                        navController.navigate(CoffeeScreen.Detail.name)
                    },
                    navController = navController
                )
            }

            composable( route = CoffeeScreen.Detail.name){
                CoffeeDetailScreen(
                    modifier = Modifier,
                    coffeeName = "Killimanjaro",
                    onPrevButton = {
                        navController.navigate(CoffeeScreen.Start.name)
                    }
                )
            }
        }
    }
}