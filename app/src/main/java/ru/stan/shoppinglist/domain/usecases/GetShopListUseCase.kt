package ru.stan.shoppinglist.domain.usecases

import androidx.lifecycle.LiveData
import ru.stan.shoppinglist.domain.model.ShopItem
import ru.stan.shoppinglist.domain.repository.Repository

class GetShopListUseCase(private val repository: Repository) {

    fun getShopList(): LiveData<List<ShopItem>> {
        return repository.getShopList()
    }
}