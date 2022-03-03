package controller

import model.Fornecedor

class Fornecedor {
    fun fornecedorFactory(
        nomeFantasia: String,
        razaoSocial: String,
        cnpj: String,
    ): Fornecedor = model.Fornecedor(
        nomeFantasia = nomeFantasia,
        razaoSocial = razaoSocial,
        cnpj = cnpj,
    )
}