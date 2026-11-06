package com.example.recordatoriosmobile.model

data class Recordatorio(
    val id: Int,
    val titulo: String,
    val descripcion: String?,
    val categoria: Categoria,
    val prioridad: Prioridad,
    val estado: Estado,
    val fecha: String?
)
