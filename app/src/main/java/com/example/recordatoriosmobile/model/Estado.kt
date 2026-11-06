package com.example.recordatoriosmobile.model

sealed interface Estado {
    val nombre: String
}

object Pendiente : Estado {
    override val nombre = "Pendiente"
}

object Completada : Estado {
    override val nombre = "Completada"
}

object Vencida : Estado {
    override val nombre = "Vencida"
}
