package com.example.ktodo.data.models

import androidx.compose.ui.graphics.Color
import com.example.ktodo.ui.theme.HighPriorityColor
import com.example.ktodo.ui.theme.LowPriorityColor
import com.example.ktodo.ui.theme.MediumPriorityColor
import com.example.ktodo.ui.theme.NonePriorityColor

enum class Priority(val color: Color) {
    HIGH(HighPriorityColor),
    MEDIUM(MediumPriorityColor),
    LOW(LowPriorityColor),
    NONE(NonePriorityColor),
}