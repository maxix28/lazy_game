package com.example.game

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight


import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.game.ui.theme.GameTheme
import kotlin.random.Random

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GameTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}
//
@Composable
fun Gameover(
    modifier: Modifier =Modifier,
    onClickBut :()->Unit){
    Box(
        Modifier
            .fillMaxSize()
            .alpha(0.7f)
            .background(Color.Gray)
        ){
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "ich liebe Olenka", fontSize = 30.sp ,)
            Button(onClick = onClickBut, modifier.alpha(1f)) { Text(text = "Click Me") }
        }



    }
}
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    var finish by remember {
        mutableStateOf(false)
    }
    Column {
        Row(){

                LazyColumn(modifier.fillMaxHeight(0.9f).width(100.dp), userScrollEnabled = !finish) {
                    items(500) { item ->
                        Image(
                            painter = painterResource(id = R.drawable.among),
                            contentDescription = "",
                            colorFilter = ColorFilter.tint(
                                Color(
                                    Random.nextFloat(), Random.nextFloat(), Random.nextFloat(),
                                )
                            ),
                            modifier = Modifier.height(90.dp).width(90.dp)
                        )

                    }
                }
                LazyColumn(modifier.fillMaxHeight(0.9f).width(100.dp), userScrollEnabled = !finish) {
                    items(500) { item ->
                        Image(
                            painter = painterResource(id = R.drawable.among),
                            contentDescription = "",
                            colorFilter = ColorFilter.tint(
                                Color(
                                    Random.nextFloat(), Random.nextFloat(), Random.nextFloat(),
                                )
                            ),
                            modifier = Modifier.height(90.dp).width(90.dp)
                        )

                    }
                }
                LazyColumn(modifier.fillMaxHeight(0.9f).width(100.dp), userScrollEnabled = !finish) {
                    items(500) { item ->
                        Image(
                            painter = painterResource(id = R.drawable.among),
                            contentDescription = "",
                            colorFilter = ColorFilter.tint(
                                Color(
                                    Random.nextFloat(), Random.nextFloat(), Random.nextFloat(),
                                )
                            ),
                            modifier = Modifier.height(90.dp).width(90.dp)
                        )

                    }
                }
                LazyColumn(modifier.fillMaxHeight(0.9f).width(100.dp), userScrollEnabled = !finish) {
                    items(500) { item ->
                        Image(
                            painter = painterResource(id = R.drawable.among),
                            contentDescription = "",
                            colorFilter = ColorFilter.tint(
                                Color(
                                    Random.nextFloat(), Random.nextFloat(), Random.nextFloat(),
                                )
                            ),
                            modifier = Modifier.height(90.dp).width(90.dp)
                        )

                    }
                }

        }

        Button(onClick = {  finish =! finish} , ) { Text(text = "Click Me") }

        }
        if(finish){
            Gameover(){  finish =! finish}
    }

//    Column {
//
//        Row(){
//            Image(painter = painterResource(id = R.drawable.among), contentDescription = "", colorFilter =  ColorFilter.tint(Color.Green), modifier = Modifier.weight(1f))
//            Image(painter = painterResource(id = R.drawable.among), contentDescription = "", colorFilter =  ColorFilter.tint(Color.Yellow), modifier = Modifier.weight(1f))
//            Image(painter = painterResource(id = R.drawable.among), contentDescription = "", colorFilter =  ColorFilter.tint(Color.Blue), modifier = Modifier.weight(1f))
//            Image(painter = painterResource(id = R.drawable.among), contentDescription = "", colorFilter =  ColorFilter.tint(Color.Red), modifier = Modifier.weight(1f))
//
//        }
//        Row(){
//            Image(painter = painterResource(id = R.drawable.among), contentDescription = "", colorFilter =  ColorFilter.tint(Color.Green), modifier = Modifier.weight(1f))
//            Image(painter = painterResource(id = R.drawable.among), contentDescription = "", colorFilter =  ColorFilter.tint(Color.Red), modifier = Modifier.weight(1f))
//            Image(painter = painterResource(id = R.drawable.among), contentDescription = "", colorFilter =  ColorFilter.tint(Color(
//                Random.nextFloat(), Random.nextFloat(), Random.nextFloat(),
//            )), modifier = Modifier.weight(1f))
//            Image(painter = painterResource(id = R.drawable.among), contentDescription = "", colorFilter =  ColorFilter.tint(Color.Yellow), modifier = Modifier
//                .weight(1f))
//
//        }
//
//
//        Button(onClick = {  finish =! finish}) { Text(text = "Click Me") }
//
//
//    }
    if(finish){
        Gameover(){  finish =! finish}
    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    GameTheme {
        Greeting("Android")
    }
}