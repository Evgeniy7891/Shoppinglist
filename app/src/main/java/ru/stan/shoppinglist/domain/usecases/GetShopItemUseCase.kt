package ru.stan.shoppinglist.domain.usecases

import ru.stan.shoppinglist.domain.model.ShopItem
import ru.stan.shoppinglist.domain.repository.Repository

class GetShopItemUseCase(private val repository: Repository)  {
    fun getShopItem(shopItemId: Int) : ShopItem {
       return repository.getShopItem(shopItemId)
    }
}