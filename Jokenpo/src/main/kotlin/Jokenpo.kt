import kotlin.random.Random

class Jokenpo {
    private var numeroSorteado: Int? = null
    private fun sortearNumero() {
        numeroSorteado = Random.nextInt(1, 3)
    }

    fun play(jogada: Int): String {
        sortearNumero()
        /*
        1- pedra
        2- papel
        3- tesoura
         */
        return if (numeroSorteado == 1 && jogada == 1 || numeroSorteado == 2 && jogada == 2 || numeroSorteado == 3 && jogada == 3) "Empate"
        else if (numeroSorteado == 1 && jogada == 3 || numeroSorteado == 2 && jogada == 3 || numeroSorteado == 1 && jogada == 2) "Jogador ganhou" else "Jogador perdeu"
    }
}
