package ru.stan.shoppinglist.domain.repository

import androidx.lifecycle.LiveData
import ru.stan.shoppinglist.domain.model.ShopItem

interface Repository {
    fun addShopItem(shopItem: ShopItem)
    fun deleteShopItem(shopItem: ShopItem)
    fun editShopItem(shopItem: ShopItem)
    fun getShopItem(shopItemId: Int) : ShopItem
    fun getShopList(): LiveData<List<ShopItem>>
}