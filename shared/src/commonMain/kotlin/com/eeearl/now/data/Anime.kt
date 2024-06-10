package com.eeearl.now.data

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Anime(
    @SerialName("title")
    val title: String? = "", // The anime adapts the final manga arc, Sennen Kessen-hen (Thousand-Year Blood War Arc), which spans from the 55th to the 74th volumes.

    @SerialName("images")
    val images: Images
)