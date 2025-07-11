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
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.hilt.navigation.compose.hiltViewModel
import com.aeternam.architecturedemo.presentation.Destinations.QuoteMviDestination
import com.aeternam.architecturedemo.presentation.common.QuoteDetail

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
                    text = "QuotesMVVM", style = MaterialTheme.typography.headlineLarge
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
            ) {
                QuoteDetail(state)
            }
        }
    }
}