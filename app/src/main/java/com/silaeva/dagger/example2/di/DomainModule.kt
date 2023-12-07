package com.silaeva.dagger.example2.di

import com.silaeva.dagger.example2.data.repository.ExampleRepositoryImpl
import com.silaeva.dagger.example2.domain.ExampleRepository
import dagger.Binds
import dagger.Module

@Module
interface DomainModule {

    @Binds
    fun provideRepository(exampleRepositoryImpl: ExampleRepositoryImpl): ExampleRepository
}