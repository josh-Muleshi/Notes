package com.example.notes.feature_node.presentation.add_edit_note.business

data class NoteTextFieldState(
    val text: String = "",
    val hint: String = "",
    val isHintVisible: Boolean = true
)
