package com.example.firstapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.Crossfade
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.firstapp.ui.theme.FirstAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FirstAppTheme {
                var current by remember { mutableStateOf(BottomTab.Scans) }

                Scaffold(
                    bottomBar = {
                        NavigationBar {
                            NavigationBarItem(
                                selected = current == BottomTab.Scans,
                                onClick = { current = BottomTab.Scans },
                                label = { Text("Scans") },
                                icon = {}
                            )
                            NavigationBarItem(
                                selected = current == BottomTab.MyCard,
                                onClick = { current = BottomTab.MyCard },
                                label = { Text("My card") },
                                icon = {}
                            )
                        }
                    }
                ) { inner ->
                    Crossfade(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(inner),
                        targetState = current,
                        label = "contentCrossfade"
                    ) { tab ->
                        when (tab) {
                            BottomTab.Scans -> CenterTitle(title = "Welcome")
                            BottomTab.MyCard -> CenterTitle(title = "Hello World")
                        }
                    }
                }
            }
        }
    }
}

private enum class BottomTab { Scans, MyCard }

private fun titleFontSize(): Float = 42f

@androidx.compose.runtime.Composable
private fun CenterTitle(title: String) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = title,
            color = MaterialTheme.colorScheme.primary,
            fontSize = titleFontSize().sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            lineHeight = 48.sp
        )
    }
}
