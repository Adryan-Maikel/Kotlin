package controller

import model.Produto
import model.Tipo

class Produto {
    fun produtoFactory(
        nome: String,
        tipo: Tipo,
        preco: Int,
    ): Produto = model.Produto(
        nome = nome,
        tipo = tipo,
        preco = preco
    )
}