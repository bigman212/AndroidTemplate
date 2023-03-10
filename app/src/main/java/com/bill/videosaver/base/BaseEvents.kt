package com.bill.videosaver.base

import androidx.annotation.StringRes
import com.github.terrakok.cicerone.androidx.FragmentScreen
import com.google.android.material.snackbar.Snackbar

class SnackbarButton(
    @StringRes val actionButtonResId: Int,
    val onActionClicked: (Snackbar) -> Unit = {}
)

data class ShowSnackbarEvent(
    val message: CharSequence? = null,
    @StringRes val stringId: Int? = null,
    val snackbarButton: SnackbarButton? = null,
    val onSnackbarDismissed: () -> Unit = {},
    val duration: Int = Snackbar.LENGTH_SHORT
) : Event

interface NavigationEvent : Event

class NavigateToEvent(val screen: FragmentScreen) : NavigationEvent
object OnBackPressedEvent : NavigationEvent
object NavigateUpEvent : NavigationEvent
