fun main() {
    val round = Round()
    var play = 0
    while (play == 0) {
        println("Try to hit the number the machine chooses.")
        println("Enter a number from 1 to 10: ")
        val attempt = readLine()!!.toInt()
        round.drawnNumber()
        println(round.checkWinner(attempt))
        println("Enter the number '0' to play again, else any other number.")
        play = readLine()!!.toInt()
    }
}
