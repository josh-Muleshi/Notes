package com.example.notes.feature_node.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.notes.ui.theme.Bleu
import com.example.notes.ui.theme.Green
import com.example.notes.ui.theme.Orange
import com.example.notes.ui.theme.Purple
import com.example.notes.ui.theme.Red
import com.example.notes.ui.theme.Yellow

@Entity
data class Note(
    @PrimaryKey
    val id: Int? = null,
    val title: String,
    val body: String,
    val timestamp: Long,
    val color: Int
){
    companion object{
        val noteColors = listOf(
            Orange, Green, Red, Yellow, Bleu, Purple
        )
    }
}

class InvalidNoteException(message: String): Exception(message)