package controller

import model.Vendedor

class Vendedor {
    fun vendedorFactory(
        nome: String,
        cpf: String,
    ): Vendedor = model.Vendedor(
        nome = nome,
        cpf = cpf,
    )
}
