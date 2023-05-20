package com.simple.mvi.common

import android.arch.lifecycle.LiveData
import androidx.lifecycle.LiveData



interface Model<STATE, INTENT> {

    val state: LiveData<STATE>

    fun dispatchIntent(intent: INTENT)
}