class Calculos {
    fun forcaPeso(massa: Float, gravidade: Float): Float = massa * gravidade
    fun forcaCentripeta(massa: Float, raio: Float, velocidade: Float): Float = massa * ((velocidade * velocidade) / raio)
    fun impulso(forca: Double, tempoFinal: Double, tempoInicial: Double): Double = (tempoFinal - tempoInicial) * forca
    fun forcaElastica(constante: Float, deformacao: Float): Float = constante * deformacao
    fun velocidadeMedia(destinoInicial: Double, destinoFinal: Double, tempoInicial: Double, tempoFinal: Double): Double = (destinoFinal - destinoInicial) / (tempoFinal - tempoInicial)
    fun mru(velocidade: Double, tempo: Double): Double = velocidade * tempo
    fun mruv(velocidadeInicial: Double, aceleracao: Double, instante: Double): Double = (velocidadeInicial + aceleracao) * instante
}

