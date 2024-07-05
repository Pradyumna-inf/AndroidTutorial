@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.androidui2

import android.graphics.drawable.Icon
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Done
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.AssistChip
import androidx.compose.material3.AssistChipDefaults
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.FilterChip
import androidx.compose.material3.FilterChipDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.RangeSlider
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Slider
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.androidui2.ui.theme.AndroidUI2Theme

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
        setContent {
            AndroidUI2Theme {
                Column {
                    Row {
                        Button(onClick = { /*TODO*/ }) {
                            Text(text = "Filled")

                        }
                        FilledTonalButton(onClick = { /*TODO*/ }) {
                            Text(text = "Tonal")

                        }
                        OutlinedButton(onClick = { /*TODO*/ }) {
                            Text(text = "Outlined")

                        }
                        ElevatedButton(onClick = { /*TODO*/ }) {
                            Text(text = "Elevated")

                        }

                    }
                    Row {
                        TextButton(onClick = { /*TODO*/ }) {
                            Text(text = "TextButton", fontSize = 15.sp)

                        }
                    }
                    Row {
                        Card(
                            colors = CardDefaults.cardColors(
                                containerColor = Color.Red
                            ),
                            modifier = Modifier
                                .size(60.dp)
                        ) {
                            Text(
                                text = "Filled"
                            )
                        }
                        ElevatedCard(
                            elevation = CardDefaults.cardElevation(
                                defaultElevation = 6.dp
                            ),
                            modifier = Modifier
                                .size(70.dp)
                        ) {
                            Text(
                                text = "Elevated",
                            )
                        }
                        OutlinedCard(
                            colors = CardDefaults.cardColors(
                                containerColor = MaterialTheme.colorScheme.surface,
                            ),
                            border = BorderStroke(1.dp, Color.Black),
                            modifier = Modifier
                                .size(80.dp)
                        ) {
                            Text(
                                text = "Outlined",

                                )
                        }


                    }
                    Row {
                        AssistChip(
                            onClick = { Log.d("Assist chip", "hello world") },
                            label = { Text("Assist chip") },
                            leadingIcon = {
                                Icon(
                                    Icons.Filled.Settings,
                                    contentDescription = "Localized description",
                                    Modifier.size(AssistChipDefaults.IconSize)
                                )
                            }
                        )
                        var selected by remember { mutableStateOf(false) }

                        FilterChip(
                            onClick = { selected = !selected },
                            label = {
                                Text("Filter chip")
                            },
                            selected = selected,
                            leadingIcon = if (selected) {
                                {
                                    Icon(
                                        imageVector = Icons.Filled.Done,
                                        contentDescription = "Done icon",
                                        modifier = Modifier.size(FilterChipDefaults.IconSize)
                                    )
                                }
                            } else {
                                null
                            },
                        )

                    }
                    Row {
                        CircularProgressIndicator(
                            modifier = Modifier.width(30.dp),
                            color = MaterialTheme.colorScheme.secondary,
                            trackColor = MaterialTheme.colorScheme.surfaceVariant,
                        )
                        LinearProgressIndicator(
                            modifier = Modifier
                                .padding(20.dp, 10.dp)
                                .width(50.dp),
                            color = MaterialTheme.colorScheme.secondary,
                            trackColor = MaterialTheme.colorScheme.surfaceVariant,
                        )


                    }
                    Row {
                        var sliderPosition by remember { mutableFloatStateOf(0f) }
                        Column {
                            Slider(
                                value = sliderPosition,
                                onValueChange = { sliderPosition = it }
                            )
                            Text(text = sliderPosition.toString())
                        }
                    }
                    Row {
                        var sliderPosition by remember { mutableStateOf(0f..100f) }
                        Column {
                            RangeSlider(
                                value = sliderPosition,
                                steps = 5,
                                onValueChange = { range -> sliderPosition = range },
                                valueRange = 0f..100f,
                                onValueChangeFinished = {
                                    // launch some business logic update with the state you hold
                                    // viewModel.updateSelectedSliderValue(sliderPosition)
                                },
                            )
                            Text(text = sliderPosition.toString())
                        }


                    }
                    Row{
                        var checked by remember { mutableStateOf(true) }

                        Switch(
                            checked = checked,
                            onCheckedChange = {
                                checked = it
                            }
                        )
                    }
                }
            }
        }
    }
}


