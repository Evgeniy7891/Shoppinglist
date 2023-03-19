package ru.stan.shoppinglist.presentation

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import ru.stan.shoppinglist.data.RepositoryImpl
import ru.stan.shoppinglist.domain.model.ShopItem
import ru.stan.shoppinglist.domain.usecases.DeleteShopItemUseCase
import ru.stan.shoppinglist.domain.usecases.EditShopItemUseCase
import ru.stan.shoppinglist.domain.usecases.GetShopListUseCase

class MainViewModel : ViewModel() {

    private val repository = RepositoryImpl

    private val getShopListUseCase = GetShopListUseCase(repository)
    private val deleteShopItemUseCase = DeleteShopItemUseCase(repository)
    private val editShopItemUseCase = EditShopItemUseCase(repository)

    val shopList = getShopListUseCase.getShopList()

    fun deleteShopItem(shopItem: ShopItem){
        deleteShopItemUseCase.deleteShopItem(shopItem)
    }
    fun changeEnabledState(shopItem: ShopItem) {
        val newItem = shopItem.copy(enabled = !shopItem.enabled)
        editShopItemUseCase.editShopItem(newItem)
    }
}