package com.example.recordatoriosmobile.model

sealed interface Categoria {
    val nombre: String
}

object Trabajo : Categoria {
    override val nombre = "Trabajo"
}

object Personal : Categoria {
    override val nombre = "Personal"
}

object Salud : Categoria {
    override val nombre = "Salud"
}

object Hogar : Categoria {
    override val nombre = "Hogar"
}

object Estudios : Categoria {
    override val nombre = "Estudios"
}
