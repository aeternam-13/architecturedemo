package com.aeternam.architecturedemo.domain.repository

import com.aeternam.architecturedemo.domain.model.Quote

interface QuoteRepository {
    fun getRandomQuote() : Quote
}