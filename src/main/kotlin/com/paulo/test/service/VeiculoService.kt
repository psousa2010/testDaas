package com.paulo.test.service

import com.paulo.test.model.Veiculo
import org.springframework.stereotype.Service

@Service
class VeiculoService {
    fun save(veiculos: List<Veiculo>) {
        veiculos.forEach { veiculo -> println(veiculo) }
    }

    fun load(): List<Veiculo> {
        return listOf(
            Veiculo(
                uoId = 1,
                placa = "BBB-4567",
                ano = 1955
            ),
            Veiculo(
                uoId = 2,
                placa = "CCC-1564",
                ano = 2005
            )
        )
            // .find { it.placa == }

    }
}