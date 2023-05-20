package com.simple.mvi.features.home

import com.simple.mvi.common.ViewAction


sealed class HomeAction : ViewAction {
    data class SearchCharacters(val name: String) : HomeAction()
    object AllCharacters : HomeAction()
}