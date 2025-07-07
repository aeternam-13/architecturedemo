package com.aeternam.architecturedemo.data.data_source

import com.aeternam.architecturedemo.domain.model.Quote

class QuoteDaoMock : QuoteDao {
    override fun getRandomQuote(): Quote {
        return Quote(author = "Should be an author", content = "should be a quote")
    }
}