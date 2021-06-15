package com.BankAPI.datasource.mock

import com.BankAPI.datasource.BankDataSource
import com.BankAPI.model.Bank
import org.springframework.stereotype.Repository

@Repository
class MockBankDataSource : BankDataSource {
    val banks = listOf(Bank("132321", 3.12, 10),
        Bank("1939", 19.0, 0),
        Bank("9088", 0.0, 10)
    )
    override fun retrieveBanks(): Collection<Bank> = banks
}