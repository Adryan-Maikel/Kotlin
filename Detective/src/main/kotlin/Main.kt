fun main() {
    println("Program to identify suspect or innocente.")
    questioning()
}

fun questioning() {
    println("Answer the questions honestly!")
    println("Answer only with 'Yes' or 'No'!")
    println("Did you call the victim?")
    var cont = 0
    if (readLine()!!.equals("yes", true)) cont++
    println("Were you at the crime scene?")
    if (readLine()!!.equals("yes", true)) cont++
    println("Do you live near the victim?")
    if (readLine()!!.equals("yes", true)) cont++
    println("I owed it to the victim?")
    if (readLine()!!.equals("yes", true)) cont++
    println("Have you ever worked with the victim?")
    if (readLine()!!.equals("yes", true)) cont++
    when (cont) {
        5 -> {
            println("You are the killer!")
        }
        4, 3 -> {
            println("You are an accomplice!")
        }
        2 -> {
            println("You are an suspect!")
        }
        else -> {
            println("You are innocent!")
        }
    }
}