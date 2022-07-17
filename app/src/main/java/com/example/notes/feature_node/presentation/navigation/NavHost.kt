package com.example.notes.feature_node.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument

@Composable
fun MainNavHost(navController: NavHostController){
    NavHost(navController = navController, startDestination =  Screen.HomeScreen.route) {
        composable(route = Screen.HomeScreen.route) {
            //HomeScreen(navController = navController)
        }
        composable(
            route = Screen.AddEditNoteScreen.route +
                    "?noteId={noteId}&noteColor={noteColor}",
            arguments = listOf(
                navArgument(
                    name = "noteId"
                ) {
                    type = NavType.IntType
                    defaultValue = -1
                },
                navArgument(
                    name = "noteColor"
                ) {
                    type = NavType.IntType
                    defaultValue = -1
                },
            )
        ) {
            val color = it.arguments?.getInt("noteColor") ?: -1
//            AddEditNoteScreen(
//                navController = navController,
//                noteColor = color
//            )
        }
    }
}