package com.example.coinsphere

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil3.compose.AsyncImage
import com.example.coinsphere.models.CardsItem
import com.example.coinsphere.models.CoinsItem
import com.example.coinsphere.models.cardsList
import com.example.coinsphere.models.coinsList
import com.example.coinsphere.ui.theme.Background
import com.example.coinsphere.ui.theme.CoinSphereTheme
import com.example.coinsphere.ui.theme.Surface
import com.example.coinsphere.ui.theme.TextDim
import com.example.coinsphere.ui.theme.TextMain

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CoinSphereTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    HomeScreen(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

// Considero que la distribucion pudo ser mejor optimizada con
// weight, y eso puede notarse en el codigo que hay partes
// comentadas.

@Composable
fun HomeScreen(modifier: Modifier = Modifier){
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Background)
            .padding(20.dp)
    ) {
        // Titulo
        Title()
        // Cards
        Cards()
        // Coins
        Coins()
    }
}

@Composable
fun Title(){
    // Titulo
    Row(
        modifier = Modifier
            .fillMaxWidth()
        //posible padding
        //.weight(1f)
    ) {
        Text(
            text = "CoinSphere",
            color = Color.White,
            fontSize = 25.sp,
            fontWeight = FontWeight.Bold
        )
    }
}

@Composable
fun Cards(){
    LazyColumn(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 12.dp)
        //.weight(1f)
    ) {
        items(cardsList){ cards ->
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(5.dp)
                    .clip(RoundedCornerShape(10.dp))
                    .background(Surface)
            ) {
                Column(
                    modifier = Modifier
                        .padding(15.dp)
                ) {
                    Text(
                        text = cards.title,
                        fontSize = 14.sp,
                        color = TextDim
                    )
                    Text(
                        text = cards.information,
                        fontSize = 19.sp,
                        fontWeight = FontWeight.Bold,
                        color = TextMain,
                        modifier = Modifier
                            .padding(top = 4.dp)
                    )
                }
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
            ) {

            }
        }
    }
}

@Composable
fun titleCoins(){
    Column(
        modifier = Modifier
            .padding(top = 10.dp)
    ) {
        Row(
            modifier = Modifier
                .padding(
                    start = 10.dp,
                    end = 10.dp,
                    top = 5.dp,
                    bottom = 5.dp
                ),
            horizontalArrangement = Arrangement.End
        ) {
            Text(
                text = "#",
                color = TextDim,
                fontSize = 13.sp,
                modifier = Modifier
                    .weight(1f)
            )
            Text(
                text = "Name",
                color = TextDim,
                fontSize = 13.sp,
                modifier = Modifier
                    .weight(6f)
            )
            Text(
                text = "Price",
                color = TextDim,
                fontSize = 13.sp,
                modifier = Modifier
                    .weight(4f),

                )
        }
    }
}

@Composable
fun Coins(){
    titleCoins()
    LazyColumn {
        items(coinsList){ coins ->
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(5.dp)
                    .height(40.dp)
                    .clip(RoundedCornerShape(10.dp))
                    .background(Surface)
            ) {
                Row(
                    modifier = Modifier
                        .padding(
                            start = 12.dp,
                            top = 6.dp,
                            end = 6.dp,
                            bottom = 12.dp
                        )
                ) {
                    Text(
                        text = "${coins.position}",
                        color = TextDim,
                        fontSize = 12.sp,
                        modifier = Modifier
                            .padding(end = 10.dp)
                    )
                    AsyncImage(
                        model = coins.image,
                        contentDescription = coins.title,
                        modifier = Modifier
                            .padding(top = 3.dp, end = 10.dp)
                    )
                    Text(
                        text = coins.title,
                        color = TextMain,
                        fontSize = 13.sp,
                        modifier = Modifier
                            .weight(4f)
                    )
                    Text(
                        text = coins.price,
                        color = TextMain,
                        fontSize = 13.sp,
                        modifier = Modifier
                            .weight(3f)
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    CoinSphereTheme {
        HomeScreen()
    }
}