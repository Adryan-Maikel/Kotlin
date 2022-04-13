abstract class Mamifero(peso: Float, altura: Short) : Animal(peso, altura) {
    open fun amamentar(): String  = "Amamamentando como um mamifero qualquer!!!"
}