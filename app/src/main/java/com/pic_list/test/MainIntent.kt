package com.pic_list.test

sealed class MainIntent {

    object NotLoad: MainIntent()

    object Loading: MainIntent()

    object Loaded: MainIntent()


}

sealed class Action {




}

sealed class MainState {

    object Idle: MainState()

    object Loading: MainState()



}