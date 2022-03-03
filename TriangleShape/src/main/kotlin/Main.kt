fun main() {
    println("Enter three values to know the shape of the triangle: ")
    println("Enter the first value: ")
    val firstSide = readLine()!!.toFloat()
    println("Enter the second value: ")
    val secondSide = readLine()!!.toFloat()
    println("Enter the third value: ")
    val thirdSide = readLine()!!.toFloat()

    if (firstSide + secondSide > thirdSide || secondSide + thirdSide > firstSide || thirdSide + firstSide > secondSide) {
        if (firstSide == secondSide && secondSide == thirdSide) {
            println("It's an equilateral triangle.")
        } else if (firstSide != secondSide && firstSide != thirdSide && secondSide != thirdSide) {
            println("It's an scalene triangle.")
        } else {
            println("It's an isosceles triangle.")
        }
    } else {
        println("Invalid triangle!")
    }
}