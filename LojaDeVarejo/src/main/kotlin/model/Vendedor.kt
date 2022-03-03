package model

class Vendedor(
    var nome: String,
    var cpf: String,
) {
    override fun toString(): String {
        return "Nome: ${nome},CPF: ${cpf}"
    }
}
