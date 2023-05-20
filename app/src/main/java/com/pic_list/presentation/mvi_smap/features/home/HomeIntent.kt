package com.simple.mvi.features.home

import com.simple.mvi.common.ViewIntent


sealed class HomeIntent : ViewIntent {
    object LoadAllCharacters : HomeIntent()
    data class SearchCharacter(val name: String) : HomeIntent()
    object ClearSearch : HomeIntent()
}