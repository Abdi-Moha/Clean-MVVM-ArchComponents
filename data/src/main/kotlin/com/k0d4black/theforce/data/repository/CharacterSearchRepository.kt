package com.k0d4black.theforce.data.repository

import com.k0d4black.theforce.data.mappers.toDomain
import com.k0d4black.theforce.data.source.CharacterSearchDataSource
import com.k0d4black.theforce.domain.models.Character
import com.k0d4black.theforce.domain.repository.ICharacterSearchRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject

/**
 * Co-ordinates data sources exposing search results
 */
class CharacterSearchRepository @Inject constructor(
    private val characterSearchDataSource: CharacterSearchDataSource
) : ICharacterSearchRepository {

    override suspend fun searchCharacters(characterName: String): Flow<List<Character>> {
        return characterSearchDataSource.query(characterName)
            .map { characters -> characters.map { eachCharacter -> eachCharacter.toDomain() } }
    }

}