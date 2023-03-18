package ru.stan.shoppinglist.domain.usecases

import ru.stan.shoppinglist.domain.model.ShopItem
import ru.stan.shoppinglist.domain.repository.Repository

class EditShopItemUseCase(private val repository: Repository) {

    fun editShopItem(shopItem: ShopItem) {
        repository.editShopItem(shopItem)
    }
}