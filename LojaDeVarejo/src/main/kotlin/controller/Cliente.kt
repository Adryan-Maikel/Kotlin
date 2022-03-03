package controller

import model.Cliente

class Cliente {
    fun clienteFactory(
        nome: String,
        cpf: String,
        endereco: String,
    ): Cliente = model.Cliente(
        nome = nome,
        cpf = cpf,
        endereco = endereco
    )
}