package com.aeternam.architecturedemo.presentation.mvvm

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.aeternam.architecturedemo.domain.model.Quote
import com.aeternam.architecturedemo.domain.usecase.QuotesUseCases
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class QuoteViewModel @Inject constructor(
    private val quotesUseCases: QuotesUseCases
) : ViewModel() {
    private val _state =
        mutableStateOf(Quote(author = "", content = "", color = 0xFFFF8C93.toInt()))
    val state: State<Quote> = _state

    init {
        getRandomQuote()
    }
    fun getRandomQuote() {
        _state.value = quotesUseCases.getRandomQuote()
    }
}