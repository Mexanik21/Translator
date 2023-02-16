package com.example.translator

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity(tableName = "data")
data class Data(
    @PrimaryKey(autoGenerate = true)
    var id: Long? = null,
    var word:String,
    var transcription:String,
    var description: String
): Serializable
