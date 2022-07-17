package com.example.notes.feature_node.domain.repository

import com.example.notes.feature_node.domain.model.Note
import kotlinx.coroutines.flow.Flow

interface NoteRepository {

    fun getNotes(): Flow<List<Note>>

    suspend fun getNoteById(id: Int): Note?

    suspend fun insertNode(note: Note)

    suspend fun deleteNote(note: Note)
}