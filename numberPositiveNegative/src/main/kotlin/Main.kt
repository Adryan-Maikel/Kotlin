fun main(args: Array<String>) {
    positiveNegative()
}

fun positiveNegative(): Unit {
    println("Enter a number: ")
    val number = readLine()!!.toFloat()
    if (number > 0) {
        print("Positive number.")
    } else if (number < 0) {
        print("Negative number.")
    } else {
        print("Neutral.")
    }
}