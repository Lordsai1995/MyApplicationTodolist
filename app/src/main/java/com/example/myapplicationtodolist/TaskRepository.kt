package com.example.myapplicationtodolist

import kotlinx.coroutines.flow.Flow

class TaskRepository(private val taskDao: TaskDao) {
    fun getAllTasks(): Flow<List<Task>> = taskDao.getAllTasks()


    suspend fun insert(task: Task) {
        taskDao.insert(task)
    }

    suspend fun delete(task: Task) {
        taskDao.delete(task)
    }

    suspend fun update(task: Task) {
        taskDao.update(task)
    }
}
