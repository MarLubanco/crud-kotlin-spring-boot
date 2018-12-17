package com.estudos.kotlin.crud.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class ListaTarefa(@Id
           @GeneratedValue
                  val id: Long = 0L,
                  val title: String = "",
                  val description: String = "")