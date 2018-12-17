package com.estudos.kotlin.crud.controller

import com.estudos.kotlin.crud.model.ListaTarefa
import com.estudos.kotlin.crud.repository.ListaRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("notes")
class NoteController(@Autowired
                     val noteRepository: ListaRepository) {

    @GetMapping
    fun list(): List<ListaTarefa> {
        return listOf(ListaTarefa(0,"Leitura", "Livro de Spring Boot"),
                ListaTarefa(0,"Pesquisa", "Ambiente com Docker"))
    }

    @PostMapping
    fun add(@RequestBody note: ListaTarefa): ListaTarefa {
        return noteRepository.save(note)
    }

    @GetMapping("books")
    fun getAll(): List<ListaTarefa> {
        return noteRepository.findAll().toList()
    }

}