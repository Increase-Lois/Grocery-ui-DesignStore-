package com.semicolon.africa.ui_storedesign.data.local.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.semicolon.africa.ui_storedesign.data.local.models.Grocery
import kotlinx.coroutines.flow.Flow

@Dao
interface GroceriesDAO {
    @Insert
    suspend fun saveGrocery(grocery: Grocery)

    @Delete
    suspend fun deleteGrocery(grocery: Grocery)

    @Query("select * from grocery")
    fun getAllGroceries() :Flow<List<Grocery>>

    @Query("select * from grocery where id = :groceryId")
    suspend fun getGrocery(groceryId :Int) : Grocery

}