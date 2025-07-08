package com.aeternam.architecturedemo.presentation.mvi

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.SwitchRight
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
import com.aeternam.architecturedemo.presentation.Screens.QuoteMvvmDestination
import com.aeternam.architecturedemo.presentation.mvvm.QuoteViewModel

@Composable
fun QuoteMviScreen(

    navController: NavController, viewModel: QuoteMviViewModel = hiltViewModel()
) {
    Scaffold { innerPadding ->
        Column(modifier = Modifier.padding(innerPadding)) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "QuotesMvi", style = MaterialTheme.typography.headlineLarge
                )
                IconButton(
                    onClick = {
                        navController.navigate(QuoteMvvmDestination)
                    },
                ) {
                    Icon(imageVector = Icons.Filled.SwitchRight, contentDescription = "Go to MVVM")
                }

            }
        }
    }
}