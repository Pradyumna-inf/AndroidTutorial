package com.example.myapplication
import androidx.compose.ui.text.buildAnnotatedString
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.basicMarquee
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Blue
import androidx.compose.ui.graphics.Color.Companion.Cyan
import androidx.compose.ui.graphics.Color.Companion.Red
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.MyApplicationTheme
import java.time.format.TextStyle




class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //enableEdgeToEdge()
        setContent {
            MyApplicationTheme {
                Column {
                    Text(text = "Hello Siliconites", color = Color.Blue, fontSize = 24.sp,
                    fontStyle = FontStyle.Italic, fontWeight = FontWeight.Bold)
                    val offset= Offset(5.0f,10.0f)
                    Text(text ="Hello Friends",
                        style = androidx.compose.ui.text.TextStyle(
                        fontSize = 24.sp,
                        shadow = Shadow(color = Color.Blue, offset = offset, blurRadius = 3f)))
                    Text(
                        buildAnnotatedString {
                            withStyle(style = SpanStyle(color = Color.Blue)) {
                                append("H")
                            }
                            append("ello ")

                            withStyle(style = SpanStyle(fontWeight = FontWeight.Bold, color = Color.Red)) {
                                append("F")
                            }
                            append("am")
                        }
                    )
                    Text(text = "")
                    val gradientColors = listOf(Color.Cyan, Color.Blue, Color.Red )

                    Text(
                        text = "Hello Guys ! How Are You",
                        style = androidx.compose.ui.text.TextStyle(
                            brush = Brush.linearGradient(
                                colors = gradientColors
                            )
                        )
                    )
                    val colors= listOf(Color.Red,Color.Green,Color.Yellow)
                    val brush = Brush.linearGradient(colors = colors)
                    Text(
                    buildAnnotatedString {
                        withStyle(
                            SpanStyle(
                                brush = brush, alpha = .5f
                            )
                        ) {
                            append("Text in ")
                        }
                        withStyle(
                            SpanStyle(
                                brush = brush, alpha = 1f
                            )
                        ) {
                            append("Compose ❤️")
                        }
                    }
                    )
                    @OptIn(ExperimentalFoundationApi::class)
                    //@Composable
                    Column(Modifier.width(250.dp)) {
                        Text("Learn about why it's great to use Jetpack Compose",
                                modifier = Modifier.basicMarquee(),
                                fontSize = 24.sp
                            )
                        }


                }

            }
        }
    }

    override fun onStart() {
        super.onStart()
        println("Lifecycle: On start ")
    }

    override fun onPause() {
        super.onPause()
        println("Lifecycle: On Pause ")
    }

    override fun onStop() {
        super.onStop()
        println("Lifecycle: On stop ")
    }

    override fun onResume() {
        super.onResume()
        println("Lifecycle: On resume ")
    }
}

