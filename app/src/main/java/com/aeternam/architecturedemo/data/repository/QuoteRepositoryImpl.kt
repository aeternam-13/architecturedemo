package com.aeternam.architecturedemo.data.repository

import com.aeternam.architecturedemo.data.data_source.QuoteDao
import com.aeternam.architecturedemo.domain.model.Quote
import com.aeternam.architecturedemo.domain.repository.QuoteRepository

class QuoteRepositoryImpl(private val dao : QuoteDao) : QuoteRepository{
    override fun getRandomQuote(): Quote {
        return dao.getRandomQuote()
    }

}