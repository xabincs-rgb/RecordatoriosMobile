package com.example.recordatoriosmobile

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.ui.Modifier
import com.example.recordatoriosmobile.ui.RecordatoriosScreen
import com.example.recordatoriosmobile.ui.theme.RecordatoriosMobileTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            RecordatoriosMobileTheme {
                RecordatoriosScreen(modifier = Modifier)
            }
        }
    }
}
