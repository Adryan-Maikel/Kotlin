package model

class Produto(
    var nome: String,
    var tipo: Tipo,
    var preco: Int
) {
    override fun toString(): String {
        return "Nome: ${nome},\nTipo de produto: ${tipo},\nPreço: RS${preco}"
    }
}