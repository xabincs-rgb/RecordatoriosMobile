package com.example.recordatoriosmobile.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.example.recordatoriosmobile.data.infoCategoria
import com.example.recordatoriosmobile.model.*

@Composable
fun RecordatorioCard(recordatorio: Recordatorio, modifier: Modifier = Modifier) {
    val (etiqueta, colorCategoria) = infoCategoria[recordatorio.categoria] ?: Pair("", Color.Unspecified)

    Card(
        modifier = modifier
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(
                text = recordatorio.titulo,
                style = MaterialTheme.typography.titleMedium,
                color = MaterialTheme.colorScheme.onSurface
            )

            Spacer(modifier = Modifier.height(4.dp))

            if (recordatorio.descripcion != null) {
                Text(
                    text = recordatorio.descripcion,
                    style = MaterialTheme.typography.bodyMedium,
                    color = MaterialTheme.colorScheme.onSurfaceVariant,
                    maxLines = 2,
                    overflow = TextOverflow.Ellipsis
                )
                Spacer(modifier = Modifier.height(8.dp))
            }

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Box(
                        modifier = Modifier
                            .background(color = colorCategoria.copy(alpha = 0.15f), shape = MaterialTheme.shapes.medium)
                            .padding(horizontal = 8.dp, vertical = 4.dp)
                    ) {
                        Text(
                            text = etiqueta,
                            style = MaterialTheme.typography.labelSmall,
                            color = colorCategoria
                        )
                    }
                    Spacer(modifier = Modifier.width(4.dp))
                    Box(
                        modifier = Modifier
                            .background(color = colorPrioridad(recordatorio.prioridad).copy(alpha = 0.15f), shape = MaterialTheme.shapes.medium)
                            .padding(horizontal = 8.dp, vertical = 4.dp)
                    ) {
                        Text(
                            text = recordatorio.prioridad.nombre,
                            style = MaterialTheme.typography.labelSmall,
                            color = colorPrioridad(recordatorio.prioridad)
                        )
                    }
                }

                Text(
                    text = recordatorio.estado.nombre,
                    style = MaterialTheme.typography.labelSmall,
                    color = colorEstado(recordatorio.estado)
                )
            }
        }
    }
}

private fun colorEstado(estado: Estado): Color = when (estado) {
    is Pendiente -> Color(0xFF6200EE)
    is Completada -> Color(0xFF00C853)
    is Vencida -> Color(0xFFCF6679)
}

private fun colorPrioridad(prioridad: Prioridad): Color = when (prioridad) {
    is Alta -> Color(0xFFCF6679)
    is Media -> Color(0xFFF9A825)
    is Baja -> Color(0xFF43A047)
}
