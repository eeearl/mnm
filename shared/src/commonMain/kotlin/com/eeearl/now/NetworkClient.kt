package com.eeearl.now

import io.github.aakira.napier.DebugAntilog
import io.github.aakira.napier.Napier
import io.ktor.client.HttpClient
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.plugins.logging.LogLevel
import io.ktor.client.plugins.logging.Logger
import io.ktor.client.plugins.logging.Logging
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.json.Json

val httpClient: HttpClient = HttpClient {
    install(ContentNegotiation) {
        json(
            Json {
                prettyPrint = true
                isLenient = true
                ignoreUnknownKeys = true
            }
        )
    }
    install(Logging) {
        logger = object: Logger {
            override fun log(message: String) {
                Napier.v("HTTP Client", null, message)
            }
        }
        level = LogLevel.HEADERS
    }.also { Napier.base(DebugAntilog()) }
}