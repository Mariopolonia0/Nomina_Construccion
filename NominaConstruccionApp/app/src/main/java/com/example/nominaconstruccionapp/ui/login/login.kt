package com.example.nominaconstruccionapp.ui.login

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.nominaconstruccionapp.R
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import com.example.nominaconstruccionapp.ui.theme.Azul300
import com.example.nominaconstruccionapp.ui.theme.Fondo
import com.example.nominaconstruccionapp.ui.theme.White
import com.example.nominaconstruccionapp.ui.theme.blueLogo

@Composable
fun login(navController: NavController) {
    Scaffold(

    ) {
        body(innerPadding = it)
    }
}

@Composable
fun body(innerPadding: PaddingValues) {
    var textUsuario by remember { mutableStateOf("") }
    var textPassword by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Fondo),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Card(
            colors = CardDefaults.cardColors(
                containerColor = White,
            )
        ) {
            Column(
                Modifier.padding(12.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = R.drawable.logo_soluction_polonia),
                    contentDescription = "bueno"
                )
                OutlinedTextField(
                    value = textUsuario,
                    onValueChange = { textUsuario = it },
                    colors = OutlinedTextFieldDefaults.colors(
                        unfocusedTextColor = blueLogo,
                        unfocusedBorderColor = blueLogo,
                        unfocusedLabelColor = blueLogo,
                        unfocusedLeadingIconColor = blueLogo
                    ),
                    textStyle = TextStyle(color = blueLogo, fontWeight = FontWeight.Bold),
                    label = { Text("Usuario") }
                )
                OutlinedTextField(
                    value = textPassword,
                    onValueChange = { textPassword = it },
                    colors = OutlinedTextFieldDefaults.colors(
                        unfocusedTextColor = blueLogo,
                        unfocusedBorderColor = blueLogo,
                        unfocusedLabelColor = blueLogo,
                        unfocusedLeadingIconColor = blueLogo
                    ),
                    textStyle = TextStyle(color = blueLogo, fontWeight = FontWeight.Bold),
                    label = { Text("Password") }
                )
                Button(
                    onClick = {},
                    colors = ButtonDefaults.buttonColors(White),
                    modifier = Modifier.padding(4.dp, 0.dp)
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.baseline_login_24),
                        contentDescription = "ic_monetization",
                        tint = blueLogo,
                        modifier = Modifier.size(
                            50.dp, 50.dp
                        ).padding(10.dp)
                    )
                }
            }
        }
    }

}