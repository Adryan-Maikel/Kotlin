package controller

import model.Cliente
import model.Fornecedor
import model.Produto
import model.Venda
import model.Vendedor

class Venda {
    fun vendaFactory(
        quantidade: Int,
        produto: Produto,
        vendedor: Vendedor,
        fornecedor: Fornecedor,
        cliente: Cliente,
    ): Venda = model.Venda(
        quantidade = quantidade,
        produto = produto,
        vendedor = vendedor,
        fornecedor = fornecedor,
        cliente = cliente,
    )
}