package com.model

import kotlinx.serialization.Serializable

@Serializable
data class CurrencyType(
    val name : String,
    val acronym: String,
    val symbol : String,
    val countryFlagImageUrl : String
)

@Serializable
data class CurrencyTypeResult(
    val values: List<CurrencyType>
)

// Lista estática simulando um Banco de Dados ou resposta de API
val currencyTypes = listOf(
    CurrencyType(
        name = "Dólar Americano",
        acronym = "USD",
        symbol = "$",
        countryFlagImageUrl = "https://flagcdn.com/w320/us.png"
    ),
    CurrencyType(
        name = "Euro",
        acronym = "EUR",
        symbol = "€",
        countryFlagImageUrl = "https://flagcdn.com/w320/eu.png"
    ),
    CurrencyType(
        name = "Real Brasileiro",
        acronym = "BRL",
        symbol = "R$",
        countryFlagImageUrl = "https://flagcdn.com/w320/br.png"
    ),
    CurrencyType(
        name = "Libra Esterlina",
        acronym = "GBP",
        symbol = "£",
        countryFlagImageUrl = "https://flagcdn.com/w320/gb.png"
    ),
    CurrencyType(
        name = "Iene Japonês",
        acronym = "JPY",
        symbol = "¥",
        countryFlagImageUrl = "https://flagcdn.com/w320/jp.png"
    ),
    CurrencyType(
        name = "Dólar Canadense",
        acronym = "CAD",
        symbol = "C$",
        countryFlagImageUrl = "https://flagcdn.com/w320/ca.png"
    ),
    CurrencyType(
        name = "Dólar Australiano",
        acronym = "AUD",
        symbol = "A$",
        countryFlagImageUrl = "https://flagcdn.com/w320/au.png"
    ),
    CurrencyType(
        name = "Yuan Chinês",
        acronym = "CNY",
        symbol = "¥",
        countryFlagImageUrl = "https://flagcdn.com/w320/cn.png"
    ),
    CurrencyType(
        name = "Franco Suíço",
        acronym = "CHF",
        symbol = "Fr",
        countryFlagImageUrl = "https://flagcdn.com/w320/ch.png"
    ),
    CurrencyType(
        name = "Peso Argentino",
        acronym = "ARS",
        symbol = "$",
        countryFlagImageUrl = "https://flagcdn.com/w320/ar.png"
    )
)