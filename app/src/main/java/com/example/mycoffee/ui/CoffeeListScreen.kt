package com.example.mycoffee.ui

import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import com.example.mycoffee.CoffeeScreen
import com.example.mycoffee.data.Coffee
import com.example.mycoffee.R

@Composable
fun CoffeeListScreen(
    modifier:Modifier = Modifier,
    coffeeList:List<Coffee>,
    detailButton: ()->Unit, //coffeeNameId が渡される
    navController: NavHostController
    ){

    val viewModel: CoffeeViewModel = viewModel()

    LazyColumn(
        modifier=modifier
    ){
        items(coffeeList) {
            Card(
                colors = CardDefaults.cardColors(
                    containerColor = MaterialTheme.colorScheme.primary,
                ),
                modifier = Modifier
                    .padding(start=dimensionResource(id=R.dimen.padding_medium),top=dimensionResource(id=R.dimen.padding_small),end=dimensionResource(id=R.dimen.padding_medium),bottom=dimensionResource(id=R.dimen.padding_small))

            ) {

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp)
                    ,
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {

                    Column(
                        modifier = Modifier.weight(3f)
                    ){
                        Text(text = stringResource(it.coffeeNameId))
                        Text(text = stringResource(it.coffeeHeadingId))
                    }


                    DetailButton(
                        modifier = Modifier.weight(1f),
                        onClick = { navController.navigate(CoffeeScreen.Detail.name)  },
                        labelResourceId = it.coffeeNameId
                    )

                    Image(
                        modifier = Modifier
                            .size(dimensionResource(id = R.dimen.image_size))
                            .padding(10.dp)
                            .weight(2f)
                        ,
                        painter = painterResource(it.coffeeImageId),
                        contentDescription = null,
                        contentScale = ContentScale.Crop

                    )

                }
            }
        }
    }
}

@Composable
fun DetailButton(
    @StringRes labelResourceId: Int,
    onClick: ()->Unit,
    modifier: Modifier = Modifier
    ){
        Button(
            modifier = modifier,
            onClick = onClick
        ){
            Text(
                text = stringResource(R.string.show_detail)
            )
        }
}