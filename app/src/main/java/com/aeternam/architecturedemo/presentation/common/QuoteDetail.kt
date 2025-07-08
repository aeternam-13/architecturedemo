package com.aeternam.architecturedemo.presentation.common

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.aeternam.architecturedemo.domain.model.Quote

@Composable
fun QuoteDetail(quote: Quote){
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) { Text(
        text = quote.content,
        style = MaterialTheme.typography.headlineMedium,
        textAlign = TextAlign.Center,
        fontWeight = FontWeight.Bold,
        color = Color(quote.color)
    )
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = quote.author,
            style = MaterialTheme.typography.headlineSmall,
            textAlign = TextAlign.Right,
            color = Color(quote.color)
        ) }
}