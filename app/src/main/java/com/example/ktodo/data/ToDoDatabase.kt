package com.example.ktodo.data

import ToDoDAO
import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.ktodo.data.models.ToDoTask

@Database(entities = [ToDoTask::class], version = 1, exportSchema = false)
abstract class ToDoDatabase : RoomDatabase() {
    abstract fun toDoDao(): ToDoDAO
}