package com.example.recordatoriosmobile.data

import com.example.recordatoriosmobile.model.*

fun filtrarPorEstado(recordatorios: List<Recordatorio>, estado: Estado): List<Recordatorio> {
    return recordatorios.filter { it.estado == estado }
}

fun filtrarPorPrioridad(recordatorios: List<Recordatorio>, prioridad: Prioridad): List<Recordatorio> {
    return recordatorios.filter { it.prioridad == prioridad }
}
