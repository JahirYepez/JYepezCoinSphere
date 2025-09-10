package com.example.coinsphere.models

data class CoinsItem(
    val title: String,
    val image: String,
    val price: String
)

val coinsList = listOf(
    CoinsItem("Bitcoin","https://upload.wikimedia.org/wikipedia/commons/thumb/4/46/Bitcoin.svg/1024px-Bitcoin.svg.png","$109,797.37"),
    CoinsItem("Ethereum","https://download.logo.wine/logo/Ethereum/Ethereum-Logo.wine.png","$4,321.21"),
    CoinsItem("Tether","https://cdn.worldvectorlogo.com/logos/tether.svg","$1.0000"),
    CoinsItem("XRP","https://cdn-icons-png.flaticon.com/512/4821/4821657.png","$2.8100"),
    CoinsItem("BNB","https://images.icon-icons.com/3006/PNG/512/bnb_cryptocurrencies_icon_188408.png","$845.0000"),
    CoinsItem("Solana","https://png.pngtree.com/png-vector/20220913/ourmid/pngtree-solana-sol-cryptocurrency-symbol-depicted-on-a-plain-white-backdrop-vector-png-image_39199908.png","$201.8500"),
    CoinsItem("USDC","https://upload.wikimedia.org/wikipedia/commons/thumb/4/4a/Circle_USDC_Logo.svg/2048px-Circle_USDC_Logo.svg.png","$0.9998"),
    CoinsItem("Dogecoin","https://i.pinimg.com/564x/fd/87/bf/fd87bf92c6e4f507d561c5687580a03e.jpg","$0.1320"),
    CoinsItem("TRON","https://www.vhv.rs/dpng/d/415-4156138_trx-tron-hd-png-download.png","$0.3630")
)