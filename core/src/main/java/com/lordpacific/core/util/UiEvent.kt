package com.lordpacific.core.util

sealed class UiEvent {
    //object NavigateUp: UiEvent()
    object Success: UiEvent()
    object NavigateUp: UiEvent()
    data class ShowSnackbar(val message: UiText): UiEvent()
}
