package com.semicolon.africa.ui_storedesign.domain.repositories

import com.semicolon.africa.ui_storedesign.data.local.models.Grocery
import kotlinx.coroutines.flow.Flow

interface GroceryRepository {
    suspend fun saveProduct(grocery: Grocery)
    fun getAllProduct():Flow<List<Grocery>>
}