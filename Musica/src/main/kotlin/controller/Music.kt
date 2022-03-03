package controller

import model.Music
import model.MusicGender

class Music {
    fun musicFactory(
        title: String,
        duration: Short,
        gender: MusicGender,
        yearOfReadable: Short,
        album: String,
        composer: String,
        record: String,
    ): Music = model.Music(
        musicGender = gender,
        record = record,
        yearOfRelease = yearOfReadable,
        composer = composer,
        album = album,
        title = title,
        duration = duration
    )
}