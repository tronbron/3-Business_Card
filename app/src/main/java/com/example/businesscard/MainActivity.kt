package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.shrinkHorizontally
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Phone
import androidx.compose.material.icons.rounded.Share
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.BitmapPainter
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.HorizontalAlignmentLine
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                }
            }
        }
    }
}

@Composable
fun BusinessCard() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xff009d94)),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.padding(bottom = 100.dp))
        Image(
            painter = painterResource(R.drawable.android_logo),
            contentDescription = "null",
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .width(120.dp)
                .height(120.dp)
        )
        Text(
            text = "James PB",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
        )
        Text(
            text = "MacGyver",
            fontSize = 16.sp,
            modifier = Modifier
        )
        Spacer(modifier = Modifier.padding(bottom = 300.dp))
        Contact(
            text = "+00 (00) 000 000",
            icon = Icons.Rounded.Phone
        )
        Contact(
            text = "@socialmediahandle",
            icon = Icons.Rounded.Share
        )
        Contact(
            text = "email@domain.com",
            icon = Icons.Rounded.Email
        )
    }
}

@Composable
fun Contact(
    text: String, icon: ImageVector
){
    Row(
        modifier = Modifier
            .padding(10.dp)
            .fillMaxWidth(0.6f)
    ) {
        Icon(
            imageVector = icon,
            contentDescription = null,
            modifier = Modifier.weight(1f)
        )
        Text(
            text = text,
            modifier = Modifier
                .align(Alignment.CenterVertically)
                .weight(3f)

        )
    }
}

@Preview(showBackground = false)
@Composable
fun GreetingCard() {
    BusinessCardTheme {
        BusinessCard()
    }
}