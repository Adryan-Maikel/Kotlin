class Cachorro(var nome: String, peso: Float, altura: Short) :  Mamifero(peso, altura) {
    override fun emitirSom(): String = "O cachorro late!!!"
    override fun comer(): String = "Comendo ração para cachorro!!!"
    override fun amamentar(): String = "Amamentando de forma canina!!!"
}