package com.paulo.test.controller

import com.paulo.test.model.Veiculo
import com.paulo.test.service.VeiculoService
import org.springframework.web.bind.annotation.*

@RestController // cria um controler para a API
@RequestMapping("/veiculos/") // Carrega a informação
class VeiculoController(
    private val veiculoService: VeiculoService
) {

    @PostMapping("cadastrar")
    fun cadastro(
        @RequestBody veiculos: List<Veiculo>
    ) {
        veiculoService.save(veiculos)
    }

    @GetMapping("carregar") // Envia a informação
    fun loadingAll(): List<Veiculo> {
        return veiculoService.load()
    }

    @DeleteMapping("deletar/{id}")
    fun deleteVeiculo(
        @PathVariable("id") id: Int, veiculo: Veiculo) {
        return veiculoService.delete(id, veiculo)
    }

    @PutMapping("atualizar/{id}")
    fun atualizarVeiculo(
        @RequestBody veiculo: Veiculo,
        @PathVariable("id") id: Int
    ) {
        return veiculoService.atualizar(id, veiculo)
    }

    // criar o delete e o put (verbos)
    // load com parametro @RequestParam
}