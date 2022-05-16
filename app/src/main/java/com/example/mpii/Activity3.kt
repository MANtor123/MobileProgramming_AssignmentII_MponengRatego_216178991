package com.example.mpii

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mpii.ui.theme.MPIITheme

class Activity3 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MPIITheme {
                var le1= appDev("APPLICATIONS DEVELOPMENT PRACTICE 3",
                    "Practical module", "1 year ")
                var le2= appDev("APPLICATIONS DEVELOPMENT THEORY 3",
                    "Theory module",
                    "1 year ")
                var le3= appDev("ICT ELECTIVES 3",
                    "Practical module", "6 months ")
                var le4= appDev("INFORMATION SYSTEMS 3",
                    "Practical module", "1 year ")
                var le5= appDev("PROFESSIONAL PRACTICE 3",
                    "Theory module", "6 months ")
                var le6= appDev("PROJECT 3",
                    "Practical module", "1 year ")
                var le7= appDev("PROJECT MANAGEMENT 3",
                    "Theory module", "6 months  ")
                var le8= appDev("PROJECT PRESENTATION 3",
                    "Practical module", "1 year ")

                val mod=listOf (le1,le2,le3,le4,le5,le6,le7,le8)
                List(mod)


            }
        }
    }
}

data class appDev(var name:String, var type: String,var period:String,)

@Composable
fun Greeting(message: appDev )
{

    Row() {

        Image(painter = painterResource(id=R.drawable.mpo),
            contentDescription ="",
        modifier = Modifier
            .size(80.dp)
            .clip(CircleShape)
            .border(1.4.dp, MaterialTheme.colors.secondary,
                CircleShape)
        )

        Spacer(modifier = Modifier.width(23.2.dp))
        var isExpanded by remember { mutableStateOf(false) }

        Column(modifier = Modifier.clickable { isExpanded =!isExpanded  }) {

            Text(text = "${message.name}",
                color = MaterialTheme.colors.secondaryVariant,


                style= MaterialTheme.typography.subtitle2

            )
            Spacer(modifier = Modifier.width(14.2.dp))

            Surface(shape = MaterialTheme.shapes.medium,
                color = MaterialTheme.colors.secondary, elevation = 800.dp) {

                Text(text = "${message.type}",style= MaterialTheme.typography.body1,
                    modifier = Modifier.padding(all = 1.6.dp),
                    maxLines = if (isExpanded) Int.MAX_VALUE else 1)
            }


            Spacer(modifier = Modifier.width(14.2.dp))

            Surface(shape = MaterialTheme.shapes.medium,
                color = MaterialTheme.colors.secondary, elevation = 800.dp) {

                Text(text = "${message.period}",style= MaterialTheme.typography.body1,
                    modifier = Modifier.padding(all = 1.6.dp),
                    maxLines = if (isExpanded) Int.MAX_VALUE else 1)
            }
        }
    }
}
@Composable
fun List (messages: List<appDev>)
{
Column() {
//

    LazyColumn()
    {

        items(messages) { s -> Greeting(message = s) }
    }
    Column(
        verticalArrangement = Arrangement.Center,

        horizontalAlignment = Alignment.CenterHorizontally,) {


    Box()

    {
        TextButton(
            onClick = { },
            border = BorderStroke(10.dp, Color.DarkGray),
            contentPadding = PaddingValues(16.dp),
            modifier = Modifier
                .size(width = 800.dp, height = 70.dp)
                .background(Color.Green),
        ) {
            Text(text = "back", color = Color.Black)
        }
    }}
}}


