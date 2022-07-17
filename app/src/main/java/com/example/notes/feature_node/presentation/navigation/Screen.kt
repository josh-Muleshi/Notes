package com.example.notes.feature_node.presentation.navigation

sealed class Screen(val route: String) {
    object HomeScreen: Screen("home")
    object AddEditNoteScreen: Screen("add_edit_note")
}