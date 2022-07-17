package com.example.notes.feature_node.domain.use_case

import com.example.notes.feature_node.domain.model.InvalidNoteException
import com.example.notes.feature_node.domain.model.Note
import com.example.notes.feature_node.domain.repository.NoteRepository

class AddNote(
    private val repository: NoteRepository
) {

    @Throws(InvalidNoteException::class)
    suspend operator fun invoke(note: Note) {
        if(note.body.isBlank()) {
            throw InvalidNoteException("The content of the note can't be empty.")
        }
        repository.insertNode(note)
    }
}