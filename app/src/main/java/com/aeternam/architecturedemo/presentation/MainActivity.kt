package com.aeternam.architecturedemo.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.aeternam.architecturedemo.presentation.mvvm.QuoteScreen
import com.aeternam.architecturedemo.ui.theme.ArchitectureDemoTheme
import dagger.hilt.android.AndroidEntryPoint
import androidx.navigation.compose.composable
import com.aeternam.architecturedemo.presentation.Destinations.QuoteMviDestination
import com.aeternam.architecturedemo.presentation.Destinations.QuoteMvvmDestination
import com.aeternam.architecturedemo.presentation.mvi.QuoteMviScreen

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ArchitectureDemoTheme {
                val navController = rememberNavController()
                NavHost(
                    navController = navController,
                    startDestination = QuoteMvvmDestination
                ){
                    composable<QuoteMvvmDestination>{
                        QuoteScreen(navController = navController)
                    }
                    composable<QuoteMviDestination>{
                        QuoteMviScreen(navController = navController)
                    }
                }

            }
        }
    }
}

