package com.k0d4black.theforce.mappers

import com.k0d4black.theforce.domain.models.Character
import com.k0d4black.theforce.domain.models.Film
import com.k0d4black.theforce.domain.models.Planet
import com.k0d4black.theforce.domain.models.Specie
import com.k0d4black.theforce.models.FilmPresentation
import com.k0d4black.theforce.models.PlanetPresentation
import com.k0d4black.theforce.models.SpeciePresentation
import com.k0d4black.theforce.models.CharacterPresentation
import com.k0d4black.theforce.commons.convertToInches


fun Character.toPresentation(): CharacterPresentation {
    return CharacterPresentation(
        this.name,
        this.birthYear,
        this.height,
        convertToInches(this.height),
        this.url
    )
}

fun Planet.toPresentation(): PlanetPresentation {
    return PlanetPresentation(this.name, this.population)
}

fun Film.toPresentation(): FilmPresentation {
    return FilmPresentation(this.title, this.openingCrawl)
}

fun Specie.toPresentation(): SpeciePresentation {
    return SpeciePresentation(this.name, this.language)
}