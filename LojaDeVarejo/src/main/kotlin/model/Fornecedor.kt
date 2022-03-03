package model

class Fornecedor(
    var nomeFantasia: String,
    var razaoSocial: String,
    var cnpj: String
) {
    override fun toString(): String {
        return "Nome fantasia: ${nomeFantasia},\nRazão Social: ${razaoSocial},\nCNPJ: ${cnpj}"
    }
}
