package com.example.ktodo.data.repositories

import ToDoDAO
import com.example.ktodo.data.models.ToDoTask
import dagger.hilt.android.scopes.ViewModelScoped
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

@ViewModelScoped
class ToDoRepository @Inject constructor(private val toDoDAO: ToDoDAO) {
    val getAllTasks: Flow<List<ToDoTask>> = toDoDAO.getAllTasks()
    val sortByLowPriority: Flow<List<ToDoTask>> = toDoDAO.sortByLowPriority()
    val sortByHighPriority: Flow<List<ToDoTask>> = toDoDAO.sortByHighPriority()

    fun getSelectedTask(taskId: Int): Flow<ToDoTask> {
        return toDoDAO.getSelectedTask(taskId)
    }

    suspend fun addTask(toDoTask: ToDoTask) {
        toDoDAO.addTask(toDoTask)
    }

    suspend fun updateTask(toDoTask: ToDoTask) {
        toDoDAO.updateTask(toDoTask)
    }

    suspend fun deleteTask(toDoTask: ToDoTask) {
        toDoDAO.deleteTask(toDoTask)
    }

    suspend fun deleteAllTasks() {
        toDoDAO.deleteAllTask()
    }

    fun searchDatabase(searchQuery: String): Flow<List<ToDoTask>> {
        return toDoDAO.searchDatabase(searchQuery)
    }
}