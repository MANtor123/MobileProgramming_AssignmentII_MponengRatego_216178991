package com.example.mpii

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.ContextCompat
import androidx.core.content.ContextCompat.startActivity
import com.example.mpii.ui.theme.MPIITheme

class Activit2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MPIITheme {


                Column(

                    verticalArrangement = Arrangement.SpaceEvenly,
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.fillMaxSize().background(Color.Black)
                ) {


                    Text(text = "Name: Mponenge Zikhona Ratego",
                        fontSize = 22.sp,
                        color = Color.White)
                    Text(text = "Course:Application Development",
                        fontSize = 22.sp,
                        color = Color.White)
                    Text(text = "Department:Information Technology",
                        fontSize = 22.sp,
                        color = Color.White)
                    Text(text = "SNumber:216178991", fontSize = 22.sp, color = Color.White)

                    Box()

                    {
                        TextButton(
                            onClick = { val nave= Intent(this@Activit2 ,Activity3::class.java)
                                startActivity(nave) },
                            border = BorderStroke(10.dp, Color.White),
                            contentPadding = PaddingValues(16.dp),
                            modifier = Modifier.size(width = 300.dp, height = 70.dp)
                                .background(Color.Blue),
                        ) {
                            Text(text = "Current module", color = Color.Black)
                        }
                    }
                }

                Column(

                    verticalArrangement = Arrangement.Bottom,
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.fillMaxSize().padding(all = 9.dp)
                ) {
                    Box()

                    {
                        TextButton(
                            onClick = {val nave= Intent(this@Activit2 ,MainActivity::class.java)
                                startActivity(nave) },
                            border = BorderStroke(10.dp, Color.White),
                            contentPadding = PaddingValues(16.dp),
                            modifier = Modifier.size(width = 400.dp, height = 70.dp)
                                .background(Color.Blue),
                        ) {
                            Text(text = "Back", color = Color.Black)
                        }

                    }
                }
            }
        }}}

