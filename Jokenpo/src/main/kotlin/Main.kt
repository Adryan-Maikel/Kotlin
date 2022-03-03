fun main(args: Array<String>) {
    val jokenpo = Jokenpo()
    println("Escolha uma opção:\n1-Pedra;\n2-Papel;\n3-Tesoura.")
    val jogada = readLine()!!.toInt()
    println(jokenpo.play(jogada))
}