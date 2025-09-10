package com.example.coinsphere.models

data class CardsItem(
    val title: String,
    val information: String
)

val cardsList = listOf(
    CardsItem("Global Market Cap","$2.18T"),
    CardsItem("Fear & Greed","Neutral (54)"),
    CardsItem("Altcoin Season","No")
)