package com.example.notes.feature_node.presentation.home.business

import com.example.notes.feature_node.domain.model.Note

sealed class HomeEvent {
    data class DeleteNote(val note: Note): HomeEvent()
    object RestoreNote: HomeEvent()
}