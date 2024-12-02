package org.mathieu.sandboxdiiage12027.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import org.mathieu.sandboxdiiage12027.ui.composables.LoginCard
import androidx.compose.material3.MaterialTheme

@Composable
fun LoginScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background) // Background adaptable
            .padding(16.dp),
        contentAlignment = Alignment.Center
    ) {
        LoginCard { username, password ->
            // Handle login logic here
            println("Username: $username, Password: $password")
        }
    }
}