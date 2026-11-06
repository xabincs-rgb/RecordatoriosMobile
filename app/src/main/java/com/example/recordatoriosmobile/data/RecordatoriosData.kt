package com.example.recordatoriosmobile.data

import androidx.compose.ui.graphics.Color
import com.example.recordatoriosmobile.model.*

val recordatorios: List<Recordatorio> = listOf(
    Recordatorio(1, "Reunión de proyecto", "Reunión con el equipo de desarrollo", Trabajo, Alta, Pendiente, "05/11/2026"),
    Recordatorio(2, "Comprar medicamentos", "Ir a la farmacia antes de las 8 pm", Salud, Media, Pendiente, "05/11/2026"),
    Recordatorio(3, "Pagar electricidad", "Pago del servicio de luz del mes", Hogar, Alta, Vencida, "04/11/2026"),
    Recordatorio(4, "Estudiar para el examen", "Repasar los capítulos 3 y 4 del libro", Estudios, Media, Pendiente, "06/11/2026"),
    Recordatorio(5, "Llamar al dentista", "Confirmar cita para la limpieza", Personal, Baja, Completada, "03/11/2026"),
    Recordatorio(6, "Entregar informe", "Informe mensual de avance al supervisor", Trabajo, Alta, Pendiente, "07/11/2026"),
    Recordatorio(7, "Revisar presión arterial", "Control mensual de salud", Salud, Baja, Pendiente, "08/11/2026"),
)

val categoriasDisponibles: Set<Categoria> = recordatorios.map { it.categoria }.toSet()

val infoCategoria: Map<Categoria, Pair<String, Color>> = mapOf(
    Trabajo to Pair("Trabajo", Color(0xFF6200EE)),
    Personal to Pair("Personal", Color(0xFF03DAC6)),
    Salud to Pair("Salud", Color(0xFFCF6679)),
    Hogar to Pair("Hogar", Color(0xFF03A9F4)),
    Estudios to Pair("Estudios", Color(0xFF8E24AA)),
)
