package dev.surehand.crypto.domain.repository

import dev.surehand.crypto.data.remote.dto.CoinDetailDto
import dev.surehand.crypto.data.remote.dto.CoinDto

interface CoinRepository {

    suspend fun getCoins(): List<CoinDto>

    suspend fun getCoinById(coinId: String): CoinDetailDto
}