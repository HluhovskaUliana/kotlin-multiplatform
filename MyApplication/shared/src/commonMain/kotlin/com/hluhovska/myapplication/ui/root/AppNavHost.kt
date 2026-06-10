package com.hluhovska.myapplication.ui.root

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.hluhovska.myapplication.ui.about.AboutScreen
import com.hluhovska.myapplication.ui.reminders.RemindersScreen

@Composable
fun AppNavHost(
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    NavHost(
        navController = navController,
        startDestination = Screen.Reminders.route,
        modifier = modifier
    ) {
        composable(Screen.Reminders.route) {
            RemindersScreen(
                onAboutClick = { navController.navigate(Screen.AboutDevice.route) }
            )
        }
        composable(Screen.AboutDevice.route) {
            AboutScreen(
                onBackClick = { navController.popBackStack() }
            )
        }
    }
}
