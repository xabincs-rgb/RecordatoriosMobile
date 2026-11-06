package com.example.recordatoriosmobile.data

import com.example.recordatoriosmobile.model.Recordatorio

object Validaciones {
    fun tituloValido(titulo: String): Boolean {
        return titulo.isNotBlank()
    }

    fun recordatorioValido(recordatorio: Recordatorio): Boolean {
        return recordatorio.titulo.isNotBlank() && recordatorio.id > 0
    }
}
