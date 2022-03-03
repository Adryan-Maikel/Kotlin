package model

class Venda(
    var quantidade: Int,
    var produto: Produto,
    var vendedor: Vendedor,
    var fornecedor: Fornecedor,
    var cliente: Cliente
) {
    override fun toString(): String {
        return "Vendedor: ${vendedor},\nCliente: ${cliente},\nFornecedor: ${fornecedor},\nProduto: ${produto},\nQuantidade: ${quantidade}"
    }
}