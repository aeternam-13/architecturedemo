package com.aeternam.architecturedemo.presentation.mvvm

import androidx.lifecycle.ViewModel
import com.aeternam.architecturedemo.domain.usecase.QuotesUseCases
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class QuoteViewModel @Inject constructor(
    private val quotesUseCases: QuotesUseCases
) : ViewModel(){


}