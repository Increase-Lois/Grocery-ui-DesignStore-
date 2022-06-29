package com.semicolon.africa.ui_storedesign.data.repositories

import com.semicolon.africa.ui_storedesign.data.local.dao.GroceriesDAO
import com.semicolon.africa.ui_storedesign.data.local.models.Grocery
import com.semicolon.africa.ui_storedesign.domain.repositories.GroceryRepository
import kotlinx.coroutines.flow.Flow

class GroceryRepositoryImpl (
    private val groceryDao:GroceriesDAO
): GroceryRepository {
    override suspend fun saveProduct(grocery: Grocery) {
        groceryDao.saveGrocery(grocery)
    }

    override fun getAllProduct(): Flow<List<Grocery>> {
        return groceryDao.getAllGroceries()
    }
}