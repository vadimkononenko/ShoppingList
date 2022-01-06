package com.game.shoppinglist.domain

import androidx.lifecycle.LiveData

interface ShopListRepository {
    fun getShopList(): LiveData<List<ShopItem>>

    fun getShopItem(shopItemId: Int): ShopItem

    fun addShopItem(shopItem: ShopItem)

    fun deleteShopItem(shopItem: ShopItem)

    fun editShopItem(shopItem: ShopItem)
}