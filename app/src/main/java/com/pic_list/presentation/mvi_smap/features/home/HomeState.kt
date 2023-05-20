package com.simple.mvi.features.home

import com.simple.data.common.CallErrors
import com.simple.domain.entities.Persona
import com.simple.mvi.common.ViewState


sealed class HomeState : ViewState{
    object Loading : HomeState()
    data class ResultAllPersona(val data : List<Persona>): HomeState()
    data class ResultSearch(val data : List<Persona>): HomeState()
    data class Exception(val callErrors: CallErrors) : HomeState()
}