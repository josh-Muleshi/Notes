package com.example.notes.feature_node.domain.use_case

import com.example.notes.feature_node.domain.model.Note
import com.example.notes.feature_node.domain.repository.NoteRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class GetNotes(
    private val repository: NoteRepository
) {
    operator fun invoke() : Flow<List<Note>> {
        return repository.getNotes().map { notes ->
            notes.sortedByDescending { it.id }
        }
    }
}