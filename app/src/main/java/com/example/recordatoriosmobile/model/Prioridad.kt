package com.example.recordatoriosmobile.model

sealed interface Prioridad {
    val nombre: String
    val valor: Int
}

object Alta : Prioridad {
    override val nombre = "Alta"
    override val valor = 3
}

object Media : Prioridad {
    override val nombre = "Media"
    override val valor = 2
}

object Baja : Prioridad {
    override val nombre = "Baja"
    override val valor = 1
}
