package com.example.myapplicationtodolist

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "task_table")
data class Task(
@PrimaryKey(autoGenerate = true) val id:Int=0,
    val title:String,
    val isDone:Boolean=false,
    val timestamp:Long=System.currentTimeMillis())