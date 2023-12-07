package com.silaeva.dagger.example2.di

import com.silaeva.dagger.example2.data.datasource.ExampleLocalDataSource
import com.silaeva.dagger.example2.data.datasource.ExampleLocalDataSourceImpl
import com.silaeva.dagger.example2.data.datasource.ExampleRemoteDataSource
import com.silaeva.dagger.example2.data.datasource.ExampleRemoteDataSourceImpl
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
interface DataModule {

    @Binds
    fun provideLocalDataSource(exampleLocalDataSourceImpl: ExampleLocalDataSourceImpl): ExampleLocalDataSource

    @Binds
    fun provideRemoteDataSource(exampleRemoteDataSourceImpl: ExampleRemoteDataSourceImpl): ExampleRemoteDataSource

}