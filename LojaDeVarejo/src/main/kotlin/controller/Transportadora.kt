package controller

import model.Transportadora

class Transportadora {
    fun transportadoraFactory(
        nomeFantasia: String,
        razaoSocial: String,
        cnpj: String,
        endereco: String,
    ): Transportadora = model.Transportadora(
        nomeFantasia = nomeFantasia,
        razaoSocial = razaoSocial,
        cnpj = cnpj,
        endereco = endereco,
    )
}