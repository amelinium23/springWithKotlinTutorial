package com.BankAPI.datasource.mock

import org.assertj.core.api.Assertions.*
import org.junit.jupiter.api.Test

internal class MockBankDataSourceTest {
    private val mockBankDataSource: MockBankDataSource = MockBankDataSource()

    @Test
    fun getBanksTest() {
        val banks = mockBankDataSource.retrieveBanks()
        assertThat(banks).isNotEmpty
        assertThat(banks.size).isGreaterThanOrEqualTo(3)
    }

    @Test
    fun `should provide some mock data`(){
        val banks = mockBankDataSource.retrieveBanks()
        assertThat(banks).allMatch {
            it.accountNumber.isNotBlank()
        }
        assertThat(banks).anyMatch {
            it.trust != 0.0
        }
        assertThat(banks).anyMatch {
            it.transactionFee != 0
        }
    }
}