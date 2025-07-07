package com.aeternam.architecturedemo.data.data_source

import com.aeternam.architecturedemo.domain.model.Quote

interface QuoteDao {
    fun getRandomQuote() : Quote
}