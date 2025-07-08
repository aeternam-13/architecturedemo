package com.aeternam.architecturedemo.presentation.mvi

import com.aeternam.architecturedemo.domain.model.Quote

sealed class QuotesScreenState {
    data object Loading : QuotesScreenState()
    data class Success(val quote : Quote) : QuotesScreenState()
}