package com.silaeva.dagger.example2.data.natwork

import android.content.Context
import android.util.Log
import com.silaeva.dagger.R
import javax.inject.Inject

class ExampleApiService @Inject constructor(
    private val context: Context,
    private val time: Long
) {

    fun method(){
        Log.d(LOG_TAG, "ExampleApiService ${context.getString(R.string.app_name)}, $time")
    }

    companion object {
        private const val LOG_TAG = "EXAMPLE_TEST"
    }
}