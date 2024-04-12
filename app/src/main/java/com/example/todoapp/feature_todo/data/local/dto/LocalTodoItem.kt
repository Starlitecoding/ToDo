package com.example.todoapp.feature_todo.data.local.dto

import android.media.MediaTimestamp
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "todo")
data class LocalTodoItem(
    var title: String,
    var description: String,
    var timestamp: Long,
    var completed: Boolean,
    var archived: Boolean,

    @PrimaryKey(autoGenerate = true)
    var id: Int?
)
