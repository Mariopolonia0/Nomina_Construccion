package com.example.nominaconstruccionapp.ui.listaNomina

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.nominaconstruccionapp.ui.theme.Azul400

@Composable
fun listaNomina(navController: NavController) {
    Scaffold(
        topBar = { AppBarTitulo() },
        floatingActionButton = { floatingActionButtonAgregar() }
    ) {
        body(innerPadding = it)
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun AppBarTitulo(
    // viewModel: ListaClienteViewModel = hiltViewModel()
) {
    val stateMostrarBuscar = remember {
        mutableStateOf(false)
    }
    TopAppBar(
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = Azul400,
            titleContentColor = Color.White,
        ),
        title = {
            Text(text = "Lista Nomina")

        },
    )
}

@Composable
private fun floatingActionButtonAgregar() {
    FloatingActionButton(
        onClick = { },
        contentColor = Color.White,
        containerColor = Azul400
    ) {
        Icon(Icons.Filled.Add, "Floating action button.")
    }
}

@Composable
private fun body(innerPadding: PaddingValues) {
    Column(
        modifier = Modifier
            .padding(innerPadding),
        verticalArrangement = Arrangement.SpaceBetween,
    ) {
        Text(
            modifier = Modifier.padding(8.dp),
            text = "ya si eladio"
        )

    }
}
