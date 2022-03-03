fun main() {
    println("Welcome to the gas station!")
    calculate()
}

fun calculate() {
    println("Want gasoline or alcohol?")
    val gasAlcohol = readLine()!!.toString()
    if (gasAlcohol.equals("alcohol", true)) {
        println("Filling more than 20 liters of alcohol has a 5% discount, else there is a 3% discount.")
        println("A liter os alcohol costs $2.00;")
        println("How many liters do you want?")
        val liter = readLine()!!.toFloat()
        val totalPrice = liter * 2.0f
        if (liter > 20) {
            val discount = totalPrice - (totalPrice * 0.05f)
            println("The value without of alcohol is $${totalPrice}, with discount it was $${discount}.")
        } else if (liter <= 20 && liter > 0) {
            val discount = totalPrice - (totalPrice * 0.03f)
            println("The value without of alcohol is $${totalPrice}, with discount it was $${discount}.")
        } else {
            println("Enter a valid liters value.")
        }
    } else if (gasAlcohol.equals("gasoline", true)) {
        println("Filling more than 20 liters of gasoline has a 6% discount, else there is a 4% discount.")
        println("A liter os gasoline costs $3.00;")
        println("How many liters do you want?")
        val liter = readLine()!!.toFloat()
        val totalPrice = liter * 3.0f
        if (liter > 20) {
            val discount = totalPrice - (totalPrice * 0.06f)
            println("The value without of gasoline is $${totalPrice}, with discount it was $${discount}.")
        } else if (liter <= 20 && liter > 0) {
            val discount = totalPrice - (totalPrice * 0.04f)
            println("The value without of gasoline is $${totalPrice}, with discount it was $${discount}.")
        }
    } else {
        println("Choose between gasoline or alcohol.")
    }
}