package com.paulo.test.service

import com.paulo.test.model.Veiculo
import com.paulo.test.repository.VeiculoRepository
import org.springframework.stereotype.Service
import java.util.*

@Service
class VeiculoService(
    private val veiculoRepository: VeiculoRepository
) {

    fun save(veiculos: List<Veiculo>) {
        try {
            veiculos.forEach { veiculo ->
                veiculoRepository.save(veiculo)
            }
        } catch (e: Exception) {
            println(e.message)
        }
    }

    fun load(): List<Veiculo> {
        return veiculoRepository.findAll()
    }

    fun delete(id: Int, veiculo: Veiculo) {
        val veiculoEncontrado: Optional<Veiculo> = veiculoRepository.findById(id)

        if (veiculoEncontrado.isPresent){
            veiculoRepository.deleteById(id)
            println("Veículo com identificação: ${veiculo.placa} deletado!")
        }
        else{
            println("Veiculo não encontrado!")
        }
    }

    fun atualizar(id: Int, veiculo: Veiculo) {
        val veiculoEncontrado: Optional<Veiculo> = veiculoRepository.findById(id)

        if(veiculoEncontrado.isPresent){
            veiculoRepository.save(veiculo)
            println("Veiculo de placa ${veiculo.placa} atualizado!")
        }
        else{
            println("Veiculo não encontrado!")
        }
    }
}