package com.pic_list.presentation.home

sealed class HomeAction {
    data class SearchCharacters(val name: String) : HomeAction()
    object AllCharacters : HomeAction()

}