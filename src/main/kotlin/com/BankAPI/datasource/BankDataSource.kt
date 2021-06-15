package com.BankAPI.datasource

import com.BankAPI.model.Bank

interface BankDataSource {
    fun retrieveBanks(): Collection<Bank>
}