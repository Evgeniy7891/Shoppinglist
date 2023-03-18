package ru.stan.shoppinglist.domain.usecases

import ru.stan.shoppinglist.domain.model.ShopItem
import ru.stan.shoppinglist.domain.repository.Repository

class GetShopListUseCase(private val repository: Repository) {

    fun getShopList(): List<ShopItem> {
        return repository.getShopList()
    }
}