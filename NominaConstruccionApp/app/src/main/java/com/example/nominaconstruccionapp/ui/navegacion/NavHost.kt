package com.example.nominaconstruccionapp.ui.navegacion

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.nominaconstruccionapp.ui.listaNomina.listaNomina

@Composable
fun NavHost() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = "listaNomina"
    ){
        composable("listaNomina"){
            listaNomina(navController = navController)
        }
    }
}