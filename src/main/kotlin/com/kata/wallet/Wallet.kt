package com.kata.wallet

data class Stock(val value: Double, val currency: StockType)

class Wallet(val stocks: List<Any> = emptyList()) {
    fun valuate(stockType: StockType): Stock {
        return Stock(0.0, StockType.EUR)
    }

}
