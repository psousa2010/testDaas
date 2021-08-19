package com.paulo.test.service

import com.paulo.test.model.Veiculo
import com.paulo.test.repository.VeiculoRepository
import org.springframework.stereotype.Service

@Service
class VeiculoService (
    private val veiculoRepository: VeiculoRepository
        ){

    fun save(veiculos: List<Veiculo>) {
        veiculos.forEach { veiculo -> veiculoRepository.save(veiculo) }
    }

    fun load(): List<Veiculo> {
        return listOf(
            Veiculo(
                id = 1,
                placa = "BBB-4567",
                ano = 1955
            ),
            Veiculo(
                id = 2,
                placa = "CCC-1564",
                ano = 2005
            )
        )
        // .find { it.placa == }

    }

    fun delete(veiculoId: Long) {
        return println("Veículo com identificação: $veiculoId deletado!")
    }

    fun atualizar(veiculoId: Long, veiculo: Veiculo) {
        return println("Veículo com identificação: $veiculoId foi atualizado!")
    }
}