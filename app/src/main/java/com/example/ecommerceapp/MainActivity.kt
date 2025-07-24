package com.example.ecommerceapp

import android.os.Bundle
import android.window.SplashScreen
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.ecommerceapp.ui.theme.EcommerceAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
SplashScreen()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun SplashScreen(modifier: Modifier = Modifier) {
    Image(
        painter = painterResource(id = R.drawable.img),
        null,
        contentScale = ContentScale.Crop,
        modifier = Modifier.fillMaxSize()

    )
    Column(
        modifier = Modifier.fillMaxSize()
            .padding(16.dp)
            .verticalScroll(rememberScrollState())
            .padding(10.dp),
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        Image(
            painter = painterResource(id = R.drawable.img_2),
            null,
            contentScale = ContentScale.Fit,
            modifier = Modifier.fillMaxSize()
        )

        Image(
            painter = painterResource(id = R.drawable.img_1),
            null,
            contentScale = ContentScale.Fit,
            modifier = Modifier.fillMaxWidth()
                .padding(16.dp)
        )

        Image(
            painter = painterResource(id = R.drawable.img_3),
            null,
            modifier = Modifier.fillMaxWidth()
                .padding(top = 10.dp)
                .clickable{}

        )
    }
}