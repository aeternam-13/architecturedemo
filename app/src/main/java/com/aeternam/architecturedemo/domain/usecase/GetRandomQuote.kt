package com.aeternam.architecturedemo.domain.usecase

import com.aeternam.architecturedemo.domain.model.Quote
import com.aeternam.architecturedemo.domain.repository.QuoteRepository

class GetRandomQuote(private val repository: QuoteRepository) {
    operator fun invoke(): Quote {
        return repository.getRandomQuote()
    }
}