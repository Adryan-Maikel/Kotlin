package model

class Cliente(
    val nome: String,
    val cpf: String,
    val endereco: String
) {
    override fun toString(): String {
        return "Nome: ${nome},\nCPF: ${cpf},\nEndereço: ${endereco}"
    }
}