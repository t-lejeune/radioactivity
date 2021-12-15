package com.kata.wallet

import io.cucumber.java8.En

class WalletValuationSteps : En {
    private lateinit var wallet: Wallet
    private lateinit var result: Stock


    init {
        ParameterType("stockType", "[a-zA-Z ]+") { stockType: String ->
            StockType.valueOf(stockType)
        }
        ParameterType("stock", "[0-9]+ [a-zA-Z ]+") { stock: String ->
            val split: List<String> = stock.split(" ")
             Stock(split[0].toDouble(), StockType.valueOf(split[1]))
        }
        Given("an empty wallet") {
            wallet = Wallet()
        }

        When("user valuates it in {stockType}") { type: StockType -> result = wallet.valuate(type)}
        Then("its value should be {stock}") { stock: Stock? -> println(stock) }
    }
}
