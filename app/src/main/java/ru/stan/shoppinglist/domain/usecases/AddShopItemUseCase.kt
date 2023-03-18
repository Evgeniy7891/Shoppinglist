package ru.stan.shoppinglist.domain.usecases

import ru.stan.shoppinglist.domain.model.ShopItem
import ru.stan.shoppinglist.domain.repository.Repository

class AddShopItemUseCase(private val repository: Repository) {

    fun addShopItem(shopItem: ShopItem) {
        repository.addShopItem(shopItem)
    }
}