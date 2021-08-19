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
                veiculoId = 1,
                placa = "BBB-4567",
                ano = 1955
            ),
            Veiculo(
                veiculoId = 2,
                placa = "CCC-1564",
                ano = 2005
            )
        )
        // .find { it.placa == }

    }

    fun delete(veiculoId: Long) {
        return println("Veículo com identificação: $veiculoId deletado!")
    }

    fun atualizar(veiculoId: Long) {
        return println("Veículo com identificação: $veiculoId foi atualizado!")
    }
}