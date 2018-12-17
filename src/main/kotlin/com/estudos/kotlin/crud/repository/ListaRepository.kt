package com.estudos.kotlin.crud.repository

import com.estudos.kotlin.crud.model.ListaTarefa
import org.springframework.data.repository.CrudRepository

interface ListaRepository : CrudRepository<ListaTarefa, Long>