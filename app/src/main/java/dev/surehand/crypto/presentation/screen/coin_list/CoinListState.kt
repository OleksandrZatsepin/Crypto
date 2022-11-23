package dev.surehand.crypto.presentation.screen.coin_list

import dev.surehand.crypto.domain.model.Coin

data class CoinListState(
    val isLoading: Boolean = false,
    val coins: List<Coin> = emptyList(),
    val error: String = ""
)