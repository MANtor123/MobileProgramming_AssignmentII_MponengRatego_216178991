package com.example.mpii

import android.content.Intent
import android.graphics.Color
import android.graphics.fonts.FontStyle
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.graphics.Color.Companion.Blue
import androidx.compose.ui.graphics.Color.Companion.Cyan
import androidx.compose.ui.graphics.Color.Companion.DarkGray
import androidx.compose.ui.graphics.Color.Companion.Gray
import androidx.compose.ui.graphics.Color.Companion.Green
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle.Companion.Italic
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType.Companion.Text
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.core.content.ContextCompat
import com.example.mpii.ui.theme.MPIITheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MPIITheme {


                var visible:MutableState<Boolean> = remember { mutableStateOf(false) }
                Alert(setVisible= visible)
                Text()
                Column(
                    modifier = Modifier.fillMaxWidth().fillMaxHeight(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally,
                ) {
                    Box( modifier = Modifier.padding(all = Dp(10F)).background(color = MaterialTheme.colors.secondary)
                        .border(border = BorderStroke(width = 1.dp, brush = SolidColor(Green)))
                    )
                    {
                        TextButton(onClick = { visible.value=true
                        }) {
                            Text(text = "Info",color= White)
                        }
                    }

                    Box()

                    {
                        TextButton(
                            onClick = { val gate= Intent(this@MainActivity,Activit2::class.java)
                                startActivity(gate)},
                            border = BorderStroke(10.dp, color = White),
                            contentPadding = PaddingValues(16.dp),
                            modifier = Modifier.size(width = 400.dp, height = 70.dp)
                                .background(androidx.compose.ui.graphics.Color.Cyan),
                        ) {
                            Text(text = "start journey", color = androidx.compose.ui.graphics.Color.Black)
                        }

                    }

                }


            }
        }
    }
}
@Composable
fun Text() {
    Column(

        modifier = Modifier.fillMaxWidth().fillMaxHeight(),


        verticalArrangement = Arrangement.Top,

        horizontalAlignment = Alignment.CenterHorizontally,
    ) {

        Text(

            text = "Welcome to My Jetpack Compose Journey",

                style = TextStyle(
                color = Black,
               fontWeight = FontWeight.Black,
                fontFamily = FontFamily.Default,
                background = Cyan,
                shadow = Shadow(color = Green),
                textAlign = TextAlign.Center,
            ),
            modifier = Modifier.padding(all = Dp(20.0F))
        )
    }
}
@Composable
fun Alert(setVisible: MutableState<Boolean>)
{

    if(setVisible.value){
        AlertDialog(
            onDismissRequest = { setVisible.value=false },

            confirmButton = {
                TextButton(onClick = {setVisible.value=false}) {
                    Text(text = "OK",
                        textAlign = TextAlign.Center,color = Black, modifier = Modifier.background(
                            Cyan)
                    )
                }
            },
            title = { Text(text = "Alert Dialog Title")},
            text = { Text(text = "I'd like to welcome you to my humble Jetpack Compose journey. \n" +
                    "\n" +
                    "The journey that I have endured is not easy at all but a very exciting road that I am willing to take. My perception of this journey is very exciting and were as I learn new things in every lecture lesson. I see Jetpack as the future of Android development as it will make our daily tasks as simple and easy. As much as I have learnt on it I still have that urge to explore on it. \n" +
                    "\n" +
                    "I see myself growing in Mobile development as a whole , and it is a career root I want to pursue. \n" +
                    "\n" +
                    "I wish my self a great journey as I still have a long way to go/grow. \n" +
                    "\n" +
                    "Thank you!")}
        )


    }
}
