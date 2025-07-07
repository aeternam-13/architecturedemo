package com.aeternam.architecturedemo.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.NavHost
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.aeternam.architecturedemo.presentation.mvvm.QuoteScreen
import com.aeternam.architecturedemo.ui.theme.ArchitectureDemoTheme
import dagger.hilt.android.AndroidEntryPoint
import androidx.navigation.compose.composable
import com.aeternam.architecturedemo.presentation.Screens.QuoteMvvmDestination

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
                }

            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ArchitectureDemoTheme {
        Greeting("Android")
    }
}