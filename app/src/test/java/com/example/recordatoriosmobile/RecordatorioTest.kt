package com.example.recordatoriosmobile

import com.example.recordatoriosmobile.data.*
import com.example.recordatoriosmobile.model.*
import org.junit.Assert.*
import org.junit.Test

class RecordatorioTest {

    @Test
    fun recordatorioSeCreaCorrectamente() {
        val recordatorio = Recordatorio(
            id = 1,
            titulo = "Reunión",
            descripcion = "Reunión de equipo",
            categoria = Trabajo,
            prioridad = Alta,
            estado = Pendiente,
            fecha = "05/11/2026"
        )
        assertEquals(1, recordatorio.id)
        assertEquals("Reunión", recordatorio.titulo)
        assertEquals(Trabajo, recordatorio.categoria)
        assertEquals(Alta, recordatorio.prioridad)
        assertEquals(Pendiente, recordatorio.estado)
    }

    @Test
    fun categoriasNoSeRepiten() {
        assertTrue(categoriasDisponibles.size <= recordatorios.size)
        assertTrue(categoriasDisponibles.contains(Trabajo))
        assertTrue(categoriasDisponibles.contains(Personal))
        assertTrue(categoriasDisponibles.contains(Salud))
        assertTrue(categoriasDisponibles.contains(Hogar))
        assertTrue(categoriasDisponibles.contains(Estudios))
    }

    @Test
    fun infoCategoriaTieneTodasLasCategorias() {
        assertEquals(5, infoCategoria.size)
        assertEquals("Trabajo", infoCategoria[Trabajo]?.first)
        assertEquals("Personal", infoCategoria[Personal]?.first)
    }

    @Test
    fun filtrarPorEstadoDevuelveSoloEsos() {
        val pendientes = filtrarPorEstado(recordatorios, Pendiente)
        assertTrue(pendientes.isNotEmpty())
        assertTrue(pendientes.all { it.estado == Pendiente })
    }

    @Test
    fun filtrarPorPrioridadDevuelveSoloEsos() {
        val altas = filtrarPorPrioridad(recordatorios, Alta)
        assertTrue(altas.isNotEmpty())
        assertTrue(altas.all { it.prioridad == Alta })
    }

    @Test
    fun validacionTituloVacioEsInvalido() {
        assertFalse(Validaciones.tituloValido(""))
        assertFalse(Validaciones.tituloValido("   "))
        assertTrue(Validaciones.tituloValido("Título válido"))
    }

    @Test
    fun validacionRecordatorioValido() {
        val valido = Recordatorio(1, "Título", null, Trabajo, Media, Pendiente, null)
        val invalido = Recordatorio(0, "", null, Trabajo, Media, Pendiente, null)
        assertTrue(Validaciones.recordatorioValido(valido))
        assertFalse(Validaciones.recordatorioValido(invalido))
    }
}
