package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.BitmapPainter
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.HorizontalAlignmentLine
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
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
    Column (modifier = Modifier
        .fillMaxSize()
        .background(Color(0xff009d94)),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Image(
            painter = painterResource(R.drawable.android_logo),
            contentDescription = "null",
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .width(150.dp)
                .height(150.dp)
        )
        Text(
            text = "James PB",
            modifier = Modifier
        )
        Text(
            text = "MacGyver",
            modifier = Modifier
        )
        }
    Column (modifier = Modifier
        .padding(0.dp, 0.dp, 0.dp, 50.dp)
        .fillMaxSize(),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(
            text = "+00 (00) 000 000",
            modifier = Modifier
                .padding(8.dp)
                .paint(painterResource(R.drawable.baseline_call_black_24dp))
                .weight(1f, fill = false)
            )
            Text(
            text = "@socialmediahandle",
            modifier = Modifier
                .padding(8.dp)
                .paint(painterResource(R.drawable.baseline_email_black_24dp))
            )
            Text(
            text = "email@domain.com",
            modifier = Modifier
                .padding(8.dp)
                .paint(painterResource(R.drawable.baseline_share_black_24dp))
            )
        }
    }

@Preview(showBackground = false)
@Composable
fun GreetingPreview() {
    BusinessCardTheme {
        BusinessCard()
    }
}


/**@Composable
fun BusinessCard2(
modifier: Modifier = Modifier
){
Column (
modifier = Modifier
.fillMaxSize()
.background(Color(0xff3bc639)),
verticalArrangement = Arrangement.Bottom,
horizontalAlignment = Alignment.CenterHorizontally
) {
Text(
text = "number",
modifier = modifier
)
Text(
text = "@handle",
modifier = modifier
)
Text(
text = "email",
modifier = modifier
)
}
}**/
