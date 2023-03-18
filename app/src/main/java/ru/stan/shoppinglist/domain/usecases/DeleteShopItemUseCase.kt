package ru.stan.shoppinglist.domain.usecases

import ru.stan.shoppinglist.domain.model.ShopItem
import ru.stan.shoppinglist.domain.repository.Repository

class DeleteShopItemUseCase(private val repository: Repository) {

    fun deleteShopItem(shopItem: ShopItem) {
        repository.deleteShopItem(shopItem)
    }
}