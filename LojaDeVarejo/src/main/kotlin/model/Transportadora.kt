package model

class Transportadora(
    var nomeFantasia: String,
    var razaoSocial: String,
    var cnpj: String,
    var endereco: String
) {
    override fun toString(): String {
        return "Nome fantasia: ${nomeFantasia},\nRazão social: ${razaoSocial},\nCNPJ: ${cnpj},\nEndereço: ${endereco}"
    }
}

