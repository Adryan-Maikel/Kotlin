fun main(args: Array<String>) {
    biggerSmaller()
}

fun biggerSmaller(): Unit {
    print("Digite o primeiro número: ")
    val numberOne = readLine()!!.toInt()
    println("Digite o segundo número:")
    val numberTwo = readLine()!!.toInt()
    if (numberOne > numberTwo) {
        println("O número $numberOne é maior.")
    } else if (numberTwo > numberOne) {
        println("O número $numberTwo é maior.")
    } else {
        println("Os números não fazem sentido")
    }
}