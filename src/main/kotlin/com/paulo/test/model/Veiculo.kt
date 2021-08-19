package com.paulo.test.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class Veiculo(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Int,
    val placa: String,
    val ano: Int
)