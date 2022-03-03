fun main() {
    calculate()
}

fun calculate() {
    println("Program to calculate if the year is leap year.")
    println("Enter a year to find out if it is leap year:")
    val year = readLine()!!.toShort()
    if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0) {
        println("$year is a leap Year!")
    } else if (year % 4 == 0 && year % 100 != 0) {
        println("$year is a leap year!")
    } else {
        println("$year is not leap year!")
    }
}