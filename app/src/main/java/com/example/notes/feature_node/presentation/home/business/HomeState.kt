package com.example.notes.feature_node.presentation.home.business

import com.example.notes.feature_node.domain.model.Note

data class HomeState(val notes: List<Note> = emptyList())