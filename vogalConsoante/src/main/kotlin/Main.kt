fun main(args: Array<String>) {
    vogalConsoante()
}

fun vogalConsoante(): Unit {
    println("Digite uma letra: ")
    val letra = readLine()
    if (letra != null) {
        if (letra.equals("a", true) || letra.equals("e", true) || letra.equals("i", true) || letra.equals("o",true) || letra.equals("u", true))
        {
            print("A letra $letra é uma voagal.")
        } else {
            print("A letra $letra é uma consoante.")
        }
    } else {
        print("Digite uma letra.")
    }
}