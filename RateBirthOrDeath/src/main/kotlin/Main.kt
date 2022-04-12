fun main() {
    calculate()
}

fun calculate() {
    println("Want to calculate the 'death' rate or the 'birth' rate?")
    when (readLine()!!.toString()) {
        "death" -> {
            println("What is the number of deaths?")
            val numberDeaths = readLine()!!.toShort()
            println("What is the number of inhabitants?")
            val numberInhabitant = readLine()!!.toShort()
            val deathRate = (numberDeaths * 1000) / numberInhabitant
            println("The death rate is $deathRate")
        }
        "birth" -> {
            println("How many children were born?")
            val childrenBorn = readLine()!!.toShort()
            println("What is the number of inhabitants?")
            val numberInhabitant = readLine()!!.toShort()
            val birthRate = (childrenBorn * 1000) / numberInhabitant
            println("The birth rate is $birthRate.")
        }
        else -> print("Write 'death' or 'birth'!")
    }
}
