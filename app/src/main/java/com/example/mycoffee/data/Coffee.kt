package com.example.mycoffee.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.ui.res.stringResource
import com.example.mycoffee.R

enum class Bitterness{
    Bitter,
    Normal,
    Sweet
}

enum class Acidity{
    Sour,
    Normal,
    Creamy
}

data class Coffee (
    val coffeeStr: String,
    @StringRes val coffeeNameId: Int,
    @StringRes val coffeeHeadingId: Int,
    @StringRes val coffeeDescriptionId: Int,
    @DrawableRes val coffeeImageId: Int,
    val coffeeBitterness: Bitterness,
    val coffeeAcidity: Acidity
)

val Killimanjaro =
    Coffee(
        coffeeStr = "Killimanjaro",
        coffeeNameId = R.string.killimanjaro_coffee,
        coffeeHeadingId = R.string.killimanjaro_heading,
        coffeeDescriptionId = R.string.killimanjaro_description,
        coffeeImageId = R.drawable.killimanjaro,
        coffeeBitterness = Bitterness.Sweet,
        coffeeAcidity = Acidity.Sour
    )

val Americano =
    Coffee(
        coffeeStr = "Americano",
        coffeeNameId = R.string.americano,
        coffeeHeadingId = R.string.americano_heading,
        coffeeDescriptionId = R.string.americano_description,
        coffeeImageId = R.drawable.americano,
        coffeeBitterness = Bitterness.Normal,
        coffeeAcidity = Acidity.Normal
    )

val Mocha = Coffee(
    coffeeStr = "Mocha",
    coffeeNameId = R.string.mocha,
    coffeeHeadingId = R.string.mocha_heading,
    coffeeDescriptionId = R.string.mocha_description,
    coffeeImageId = R.drawable.mocha,
    coffeeBitterness = Bitterness.Bitter,
    coffeeAcidity = Acidity.Sour
)

val BlueMountain = Coffee(
    coffeeStr = "BlueMountain",
    coffeeNameId = R.string.blue_mountain,
    coffeeHeadingId = R.string.blue_mountain_heading,
    coffeeDescriptionId = R.string.blue_mountain_description,
    coffeeImageId = R.drawable.blue_mountain,
    coffeeBitterness = Bitterness.Sweet,
    coffeeAcidity = Acidity.Creamy
)

val Colombian = Coffee(
    coffeeStr = "Colombian",
    coffeeNameId = R.string.colombian,
    coffeeHeadingId = R.string.colombian_heading,
    coffeeDescriptionId = R.string.colombian_description,
    coffeeImageId = R.drawable.colombian,
    coffeeBitterness = Bitterness.Normal,
    coffeeAcidity = Acidity.Creamy
)

val Guatemala = Coffee(
    coffeeStr = "Guatemala",
    coffeeNameId = R.string.guatemala,
    coffeeHeadingId = R.string.guatemala_heading,
    coffeeDescriptionId = R.string.guatemala_description,
    coffeeImageId = R.drawable.guatemala,
    coffeeBitterness = Bitterness.Bitter,
    coffeeAcidity = Acidity.Sour
)

val Ethiopia = Coffee(
    coffeeStr = "Ethiopia",
    coffeeNameId = R.string.ethiopia,
    coffeeHeadingId = R.string.ethiopia_heading,
    coffeeDescriptionId = R.string.ethiopia_description,
    coffeeImageId = R.drawable.ethiopia,
    coffeeBitterness = Bitterness.Sweet,
    coffeeAcidity = Acidity.Sour
)


object DataSource {
    val coffeeList = listOf(
        Killimanjaro,
        Americano,
        Mocha,
        BlueMountain,
        Colombian,
        Guatemala,
        Ethiopia
    )
}
