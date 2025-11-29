package com

import com.currencyTypes
import io.ktor.http.HttpStatusCode
import io.ktor.serialization.kotlinx.json.*
import io.ktor.server.application.*
import io.ktor.server.plugins.contentnegotiation.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {
        // tipos de moedas (nome, acronimo, símbolo, imagem bandeira do país)
        get("/currency_types") {
            call.respond(CurrencyTypeResult(
                values = currencyTypes
            ))
        }

        //conversão de valores, moeda atual => moeda alvo, taxa de conversoa entre as moedas.
        //from e to serão os acronimos de cada moeda
        get("/exchange_rate/{from}/{to}") {
            val from = call.parameters["from"]?.uppercase() ?: return@get call.respondText(
                status = HttpStatusCode.BadRequest,
                text = "Erro ao obter acrônimo da moeda atual."
            )
            val to = call.parameters["to"]?.uppercase() ?: return@get call.respondText(
                status = HttpStatusCode.BadRequest,
                text = "Erro ao obter acrônimo da moeda alvo."
            )
        }
    }
}
