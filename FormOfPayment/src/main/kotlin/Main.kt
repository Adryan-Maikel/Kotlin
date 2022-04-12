fun main() {
    println("Your purchase was U$1000.00")
    calculate()
}
fun calculate(){
    val price = 1000
    println("What is the payment method?")
    println("1 -> Pay cash, you have a 10% discount;\n2 -> Pay by the end of the month, you get a 3% increase;\n3 -> Pay in installments, plus 1.5% per month.")
    when (readLine()!!.toInt()) {
        1 -> {
            val discount = price - (price * 0.1)
            println("The total to be paid is U$$discount")}
        2 -> {
            val feesMonth = price + (price * 0.03)
            println("The total to be paid by the end of the month is U$$feesMonth")
        }
        3 -> {
            println("Do you want to pay in how many installments?")
            val installments = readLine()!!.toInt()
            val fees =  price * 0.015 * installments
            val installmentFess = price + fees
            println("In all of your $installments, you will have to pay U$$installmentFess, with U$$fees in interest.")
        }
        else -> println("Enter a value valid!")
    }
}