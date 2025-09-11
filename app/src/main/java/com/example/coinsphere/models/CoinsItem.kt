package com.example.coinsphere.models

data class CoinsItem(
    val position: Int,
    val title: String,
    val image: String,
    val price: String
)

val coinsList = listOf(
    CoinsItem(1,"Bitcoin","https://images.vexels.com/media/users/3/259745/isolated/preview/76fa2a043d27b5aa4239ad4cf28a341a-moneda-de-bitcoin-individual.png","$109,797.37"),
    CoinsItem(2,"Ethereum","https://cdn-icons-png.flaticon.com/128/15301/15301597.png","$4,321.21"),
    CoinsItem(3,"Tether","https://cdn-icons-png.flaticon.com/512/6001/6001566.png","$1.0000"),
    CoinsItem(4,"XRP","https://cdn-icons-png.flaticon.com/512/4821/4821657.png","$2.8100"),
    CoinsItem(5,"BNB","https://images.icon-icons.com/3006/PNG/512/bnb_cryptocurrencies_icon_188408.png","$845.0000"),
    CoinsItem(6,"Solana","https://cdn-icons-png.flaticon.com/512/6001/6001527.png","$201.8500"),
    CoinsItem(7,"USDC","https://assets.streamlinehq.com/image/private/w_300,h_300,ar_1/f_auto/v1/icons/vectors/usdc-fpxuadmgafrjjy85bgie5.png/usdc-kksfxcrdl3f9pjx0v6jxxp.png?_a=DATAg1AAZAA0","$0.9998"),
    CoinsItem(8,"Dogecoin","https://res.coinpaper.com/coinpaper/dogecoin_doge_logo_f18d59aae4.png","$0.1320"),
    CoinsItem(9,"TRON","https://cdn-icons-png.flaticon.com/512/12114/12114250.png","$0.3630")
)