package dev.surehand.crypto.presentation.screen.coin_detail

import dev.surehand.crypto.domain.model.CoinDetail

data class CoinDetailState(
    val isLoading: Boolean = false,
    val coin: CoinDetail? = null,
    val error: String = ""
)
