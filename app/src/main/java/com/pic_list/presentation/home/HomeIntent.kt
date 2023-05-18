package com.pic_list.presentation.home

sealed class HomeIntent {

    object LoadAllCharacters : HomeIntent()
    data class SearchCharacter(val name: String) : HomeIntent()
    object ClearSearch : HomeIntent()


}