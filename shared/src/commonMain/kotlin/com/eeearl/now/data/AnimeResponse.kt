package com.eeearl.now.data

import androidx.compose.runtime.Immutable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Immutable
@Serializable
data class AnimeResponse(
    @SerialName("data")
    val list: List<Anime> = listOf(),
    @SerialName("pagination")
    val pagination: Pagination?
)