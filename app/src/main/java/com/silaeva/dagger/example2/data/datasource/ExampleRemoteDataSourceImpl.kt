package com.silaeva.dagger.example2.data.datasource

import com.silaeva.dagger.example2.data.natwork.ExampleApiService
import javax.inject.Inject

class ExampleRemoteDataSourceImpl @Inject constructor (
    private val apiService: ExampleApiService
): ExampleRemoteDataSource {

    override fun method(){
        apiService.method()
    }
}