package com.aeternam.architecturedemo.presentation.mvi

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.aeternam.architecturedemo.domain.model.Quote
import com.aeternam.architecturedemo.domain.usecase.QuotesUseCases
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.*
import javax.inject.Inject

@HiltViewModel
class QuoteMviViewModel @Inject constructor(
    private val quotesUseCases: QuotesUseCases
) : ViewModel() {
    private val _state =
        mutableStateOf<QuotesScreenState>(QuotesScreenState.Loading)
    val state: State<QuotesScreenState> = _state
    private var job : Job? = null

    init {
        getRandomQuote()
    }

    fun onIntent( intent : QuotesScreenIntent){
        when(intent){
            QuotesScreenIntent.GetRandomQuoteIntent -> getRandomQuote()
        }
    }

    private fun getRandomQuote() {
        job?.cancel()
        _state.value = QuotesScreenState.Loading
        job = CoroutineScope(Dispatchers.IO).launch {
            delay(1000)
            _state.value = QuotesScreenState.Success(quotesUseCases.getRandomQuote())
        }
    }

}