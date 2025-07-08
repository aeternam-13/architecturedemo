package com.aeternam.architecturedemo.presentation.mvvm

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowCircleRight
import androidx.compose.material.icons.filled.Radar
import androidx.compose.material.icons.filled.SwitchLeft
import androidx.compose.material3.FloatingActionButton

import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.hilt.navigation.compose.hiltViewModel
import com.aeternam.architecturedemo.domain.model.Quote
import com.aeternam.architecturedemo.presentation.Screens.QuoteMviDestination

@Composable
fun QuoteScreen(

    navController: NavController, viewModel: QuoteViewModel = hiltViewModel()){

    val state = viewModel.state.value

    Scaffold(
        floatingActionButton = {
            FloatingActionButton(
                onClick = { viewModel.getRandomQuote()
                }
            ) {
                Icon ( imageVector = Icons.Filled.Radar, contentDescription = "randomize")
            }
        }
    ) {
        innerPadding ->
        Column(modifier = Modifier.padding(innerPadding)) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "QuotesMvvm", style = MaterialTheme.typography.headlineLarge
                )
                IconButton(
                    onClick = {
                        navController.navigate(QuoteMviDestination)
                    },
                ) {
                    Icon(imageVector = Icons.Filled.SwitchLeft, contentDescription = "Go to MVI")
                }

            }
            Spacer(modifier = Modifier.height(16.dp))
            Column(
                modifier = Modifier

                    .fillMaxSize()
                    .padding(8.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = state.content,
                    style = MaterialTheme.typography.headlineMedium,
                    textAlign = TextAlign.Center,
                    fontWeight = FontWeight.Bold,
                    color = Color(state.color)
                )
                Spacer(modifier = Modifier.height(16.dp))
                Text(
                    text = state.author,
                    style = MaterialTheme.typography.headlineSmall,
                    textAlign = TextAlign.Right,
                    color = Color(state.color)
                )

            }
        }
    }
}