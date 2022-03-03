package view

import model.Classification
import model.MovieGender
import model.MusicGender

fun main() {
    val musicController = controller.Music()
    val music = musicController.musicFactory(
        duration = 120,
        title = "Baton de Cereja",
        composer = "Israel e Rodolfo",
        gender = MusicGender.COUNTRYSIDE,
        yearOfReadable = 2021,
        record = "Globo Record",
        album = "Israel e Rodolfo Ao Vivo"

    )
    println(music)

    val movieController = controller.Movie()
    val movie = movieController.movieFactory(
        title = "Jurassic Park - Domain",
        gender = MovieGender.ADVENTURE,
        duration = 120,
        classification = Classification.TEENAGE,
        premiere = true,
        yearOfRelease = 2022,
        director = "Steven Spielberg",
        screenwriter = "David Koepp, Michael Crichton",
    )
    println(movie)
}