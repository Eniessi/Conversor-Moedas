package com.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ExchangeRateResult(
    val from: String,
    val to: String,
    @SerialName("exchange_rate")
    val exchangeRate: Double
)

val exchangeRates: Map<String, Map<String, Double>> = mapOf(
    "USD" to mapOf(
        "USD" to 1.0000,
        "EUR" to 0.9500,
        "BRL" to 6.0500,
        "GBP" to 0.7900,
        "JPY" to 152.0000,
        "CAD" to 1.4100,
        "AUD" to 1.5400,
        "CNY" to 7.2500,
        "CHF" to 0.8900,
        "ARS" to 1150.0000
    ),
    "EUR" to mapOf(
        "USD" to 1.0526,
        "EUR" to 1.0000,
        "BRL" to 6.3684,
        "GBP" to 0.8316,
        "JPY" to 160.0000,
        "CAD" to 1.4842,
        "AUD" to 1.6211,
        "CNY" to 7.6316,
        "CHF" to 0.9368,
        "ARS" to 1210.5263
    ),
    "BRL" to mapOf(
        "USD" to 0.1653,
        "EUR" to 0.1570,
        "BRL" to 1.0000,
        "GBP" to 0.1306,
        "JPY" to 25.1240,
        "CAD" to 0.2331,
        "AUD" to 0.2545,
        "CNY" to 1.1983,
        "CHF" to 0.1471,
        "ARS" to 190.0826
    ),
    "GBP" to mapOf(
        "USD" to 1.2658,
        "EUR" to 1.2025,
        "BRL" to 7.6582,
        "GBP" to 1.0000,
        "JPY" to 192.4051,
        "CAD" to 1.7848,
        "AUD" to 1.9494,
        "CNY" to 9.1772,
        "CHF" to 1.1266,
        "ARS" to 1455.6962
    ),
    "JPY" to mapOf(
        "USD" to 0.006579,
        "EUR" to 0.006250,
        "BRL" to 0.0398,
        "GBP" to 0.005197,
        "JPY" to 1.0000,
        "CAD" to 0.009276,
        "AUD" to 0.0101,
        "CNY" to 0.0477,
        "CHF" to 0.005855,
        "ARS" to 7.5658
    ),
    "CAD" to mapOf(
        "USD" to 0.7092,
        "EUR" to 0.6738,
        "BRL" to 4.2908,
        "GBP" to 0.5603,
        "JPY" to 107.8014,
        "CAD" to 1.0000,
        "AUD" to 1.0922,
        "CNY" to 5.1418,
        "CHF" to 0.6312,
        "ARS" to 815.6028
    ),
    "AUD" to mapOf(
        "USD" to 0.6494,
        "EUR" to 0.6169,
        "BRL" to 3.9286,
        "GBP" to 0.5130,
        "JPY" to 98.7013,
        "CAD" to 0.9156,
        "AUD" to 1.0000,
        "CNY" to 4.7078,
        "CHF" to 0.5779,
        "ARS" to 746.7532
    ),
    "CNY" to mapOf(
        "USD" to 0.1379,
        "EUR" to 0.1310,
        "BRL" to 0.8345,
        "GBP" to 0.1090,
        "JPY" to 20.9655,
        "CAD" to 0.1945,
        "AUD" to 0.2124,
        "CNY" to 1.0000,
        "CHF" to 0.1228,
        "ARS" to 158.6207
    ),
    "CHF" to mapOf(
        "USD" to 1.1236,
        "EUR" to 1.0674,
        "BRL" to 6.7978,
        "GBP" to 0.8876,
        "JPY" to 170.7865,
        "CAD" to 1.5843,
        "AUD" to 1.7303,
        "CNY" to 8.1461,
        "CHF" to 1.0000,
        "ARS" to 1292.1348
    ),
    "ARS" to mapOf(
        "USD" to 0.000870,
        "EUR" to 0.000826,
        "BRL" to 0.005261,
        "GBP" to 0.000687,
        "JPY" to 0.1322,
        "CAD" to 0.001226,
        "AUD" to 0.001339,
        "CNY" to 0.006304,
        "CHF" to 0.000774,
        "ARS" to 1.0000
    )
)

val usdEut = exchangeRates["USD"]?.get("EUR")