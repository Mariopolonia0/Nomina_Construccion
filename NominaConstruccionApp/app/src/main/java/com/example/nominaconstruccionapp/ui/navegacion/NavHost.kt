package com.example.nominaconstruccionapp.ui.navegacion

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.nominaconstruccionapp.ui.listaNomina.listaNomina
import com.example.nominaconstruccionapp.ui.login.login

@Composable
fun NavHost() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = "login"
    ) {
        composable("login") {
            login(navController = navController)
        }
        composable("listaNomina") {
            listaNomina(navController = navController)
        }
    }
}