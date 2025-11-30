package com

import com.model.CurrencyTypeResult
import com.model.ExchangeRateResult
import com.model.currencyTypes
import com.model.exchangeRates
import com.model.orUnknown
import io.ktor.http.HttpStatusCode
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {
        // tipos de moedas (nome, acronimo, símbolo, imagem bandeira do país)
        get("/currency_types") {
            call.respond(
                CurrencyTypeResult(
                    values = currencyTypes
                )
            )
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

            call.respond(
                ExchangeRateResult(from = from.orUnknown(),
                    to = to.orUnknown(),
                    exchangeRate = exchangeRates[from]?.get(to) ?: 0.0
                )
            )
        }
    }
}
