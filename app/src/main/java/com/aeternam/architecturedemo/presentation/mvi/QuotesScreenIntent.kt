package com.aeternam.architecturedemo.presentation.mvi

sealed class QuotesScreenIntent {
    data object GetRandomQuoteIntent : QuotesScreenIntent()
}