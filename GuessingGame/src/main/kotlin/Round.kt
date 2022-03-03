import kotlin.random.Random

class Round {
    private var numberDrawn: Int? = null
    fun drawnNumber() {
        numberDrawn = Random.nextInt(0, 10)
    }

    fun checkWinner(attempt: Int): String =
        if (attempt == numberDrawn) "Winner gamer!" else "Machine winner!! With the $numberDrawn"
}
