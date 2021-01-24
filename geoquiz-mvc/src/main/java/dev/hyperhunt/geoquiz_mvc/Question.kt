package dev.hyperhunt.geoquiz_mvc

import androidx.annotation.StringRes

data class Question(@StringRes val textResId: Int, val answer: Boolean)