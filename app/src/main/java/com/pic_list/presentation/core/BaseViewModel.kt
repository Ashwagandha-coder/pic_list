package com.pic_list.presentation.core

import com.pic_list.presentation.home.HomeAction
import com.pic_list.presentation.home.HomeIntent
import com.pic_list.test.MainIntent

abstract class BaseViewModel {

    fun handleIntent(intent: HomeIntent) =
        when(intent) {
            is HomeIntent -> HomeAction.AllCharacters
        }


    fun handleAction(action: HomeAction) {}



}