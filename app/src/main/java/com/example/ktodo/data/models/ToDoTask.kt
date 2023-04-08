package com.example.ktodo.data.models

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.ktodo.ui.util.Constants

@Entity(tableName = Constants.DATABASE_TABLE)
data class ToDoTask(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val title: String,
    val description: String,
    val priority: Priority,
)
