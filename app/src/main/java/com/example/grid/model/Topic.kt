package com.example.grid.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Topic(
    @StringRes val stringResourceId: Int,
    @StringRes val countTopicId: Int,
    @DrawableRes val imageResourceId: Int

)