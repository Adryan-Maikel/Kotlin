package model

class Movie {
    var title: String
    var gender: MovieGender
    var duration: Short
    var classification: Classification
    var premiere: Boolean
    var yearOfRelease: Short
    var director: String
    var screenwriter: String

    constructor(
        title: String,
        gender: MovieGender,
        duration: Short,
        classification: Classification,
        premiere: Boolean,
        yearOfRelease: Short,
        director: String,
        screenwriter: String,
    ) {
        this.title = title
        this.gender = gender
        this.duration = duration
        this.classification = classification
        this.premiere = premiere
        this.yearOfRelease = yearOfRelease
        this.screenwriter = screenwriter
        this.director = director
    }

    override fun toString():String{
        return "Tittle: ${this.title}, Director: ${this.director}, Gender: ${this.gender}, Duration: ${this.duration}, Classification: ${this.classification}, Year Of Release: ${this.yearOfRelease}, Screenwriter: ${this.screenwriter}, Premiere: ${this.premiere}"
    }
}
