package dev.surehand.crypto.data.repository

import dev.surehand.crypto.data.remote.CoinPaprikaApi
import dev.surehand.crypto.data.remote.dto.CoinDetailDto
import dev.surehand.crypto.data.remote.dto.CoinDto
import dev.surehand.crypto.domain.repository.CoinRepository
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(
    private val api: CoinPaprikaApi
) : CoinRepository {

    override suspend fun getCoins(): List<CoinDto> {
        return api.getCoins()
    }

    override suspend fun getCoinById(coinId: String): CoinDetailDto {
        return api.getCoinById(coinId)
    }
}