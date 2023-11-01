package com.example.composequadrants

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composequadrants.ui.theme.ComposeQuadrantsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeQuadrantsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting() {
    Column {
        Row (modifier = Modifier.weight(1f)) {
            Box(
                modifier = Modifier
                    .weight(1f)
                    .background(colorResource(id = R.color.box_1))
                    .fillMaxSize()
            ){
                Column(
                    modifier = Modifier
                        .padding(16.dp)
                        .align(alignment = Alignment.Center)
                ) {
                    Text(
                        text = "Text composable",
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .padding(bottom = 16.dp)
                            .fillMaxWidth(),
                        textAlign = TextAlign.Center
                    )
                    Text(
                        text = "Displays text and follows the recommended Material Design guidelines.",
                        textAlign = TextAlign.Justify
                    )
                }
            }
            Box(
                modifier = Modifier
                    .weight(1f)
                    .background(colorResource(id = R.color.box_2))
                    .fillMaxSize()
            ){
                Column(
                    modifier = Modifier
                        .padding(16.dp)
                        .align(alignment = Alignment.Center)
                ) {
                    Text(
                        text = "Image composable",
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .padding(bottom = 16.dp)
                            .fillMaxWidth(),
                        textAlign = TextAlign.Center
                    )
                    Text(
                        text = "Creates a composable that lays out and draws a given Painter class object.",
                        textAlign = TextAlign.Justify
                    )
                }
            }
        }
        Row (modifier = Modifier.weight(1f)) {
            Box(
                modifier = Modifier
                    .weight(1f)
                    .background(colorResource(id = R.color.box_3))
                    .fillMaxSize()
            ){
                Column(
                    modifier = Modifier
                        .padding(16.dp)
                        .align(alignment = Alignment.Center)
                ) {
                    Text(
                        text = "Row composable",
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .padding(bottom = 16.dp)
                            .fillMaxWidth(),
                        textAlign = TextAlign.Center
                    )
                    Text(
                        text = "A layout composable that places its children in a horizontal sequence.",
                        textAlign = TextAlign.Justify
                    )
                }
            }
            Box(
                modifier = Modifier
                    .weight(1f)
                    .background(colorResource(id = R.color.box_4))
                    .fillMaxSize()
            ){
                Column(
                    modifier = Modifier
                        .padding(16.dp)
                        .align(alignment = Alignment.Center)
                ) {
                    Text(
                        text = "Column composable",
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .padding(bottom = 16.dp)
                            .fillMaxWidth(),
                        textAlign = TextAlign.Center
                    )
                    Text(
                        text = "A layout composable that places its children in a vertical sequence.",
                        textAlign = TextAlign.Justify
                    )
                }
            }
        }

    }
}

@Preview(showBackground = true,
    showSystemUi = true)
@Composable
fun GreetingPreview() {
    ComposeQuadrantsTheme {
        Greeting()
    }
}