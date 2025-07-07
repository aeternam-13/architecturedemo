package com.aeternam.architecturedemo.di

import com.aeternam.architecturedemo.data.data_source.QuoteDao
import com.aeternam.architecturedemo.data.data_source.QuoteDaoMock
import com.aeternam.architecturedemo.data.repository.QuoteRepositoryImpl
import com.aeternam.architecturedemo.domain.repository.QuoteRepository
import com.aeternam.architecturedemo.domain.usecase.GetRandomQuote
import com.aeternam.architecturedemo.domain.usecase.QuotesUseCases
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideQuoteDao() : QuoteDao{
        return QuoteDaoMock()
    }

    @Provides
    @Singleton
    fun provideQuoteRepository(dao : QuoteDao) : QuoteRepository{
        return QuoteRepositoryImpl(dao)
    }

    @Provides
    @Singleton
    fun provideQuoteUseCases(repository: QuoteRepository) : QuotesUseCases{
        return QuotesUseCases(
            getRandomQuote = GetRandomQuote(repository)
        )
    }


}