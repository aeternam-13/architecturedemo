package com.aeternam.architecturedemo.presentation.mvi

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Radar
import androidx.compose.material.icons.filled.SwitchRight
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.aeternam.architecturedemo.presentation.Destinations.QuoteMvvmDestination
import com.aeternam.architecturedemo.presentation.common.QuoteDetail

@Composable
fun QuoteMviScreen(
    navController: NavController, viewModel: QuoteMviViewModel = hiltViewModel()
) {
    val state = viewModel.state.value
    Scaffold(
        floatingActionButton = {
            FloatingActionButton(
                onClick = { viewModel.onIntent(QuotesScreenIntent.GetRandomQuoteIntent) }) {
                Icon(imageVector = Icons.Filled.Radar, contentDescription = "randomize")
            }
        }) { innerPadding ->
        Column(modifier = Modifier.padding(innerPadding)) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "QuotesMVI", style = MaterialTheme.typography.headlineLarge
                )
                IconButton(
                    onClick = {
                        navController.navigate(QuoteMvvmDestination)
                    },
                ) {
                    Icon(imageVector = Icons.Filled.SwitchRight, contentDescription = "Go to MVVM")
                }

            }

            Column(
                modifier = Modifier.fillMaxSize().padding(8.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                when (state) {
                    QuotesScreenState.Loading -> CircularProgressIndicator()
                    is QuotesScreenState.Success -> QuoteDetail(state.quote)
                }
            }
        }
    }
}