package com.example.tugas3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tugas3.ui.theme.Tugas3Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Tugas3Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background

                ) {
                    GreetingText(message = "Happy Gradution, Dillon!",
                        from = "From Jhonson"
                    )
                }
            }
        }
    }
}

@Composable
fun GreetingText (message: String,from : String, modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = modifier.padding(20.dp)
    ){
        Text(
            text = message,
            fontSize = 70.sp,
            lineHeight = 80.sp,
            textAlign = TextAlign.Center,
            fontStyle = FontStyle.Italic
        )
        Text(
            text = from,
            fontSize = 30.sp,
            modifier = Modifier
                .padding(20.dp)
                .align(alignment = Alignment.End),
            fontStyle = FontStyle.Italic
        )
    }
}




@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Tugas3Theme {
        GreetingText(message = "Hi Dillon Carol Heatubun Bonay,How are you?",
            from = "From Sean"
        )
    }
}