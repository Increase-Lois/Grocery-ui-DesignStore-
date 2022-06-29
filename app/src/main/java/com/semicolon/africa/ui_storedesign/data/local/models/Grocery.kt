package com.semicolon.africa.ui_storedesign.data.local.models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.math.BigDecimal

@Entity
data class Grocery(
    @PrimaryKey(autoGenerate = true)
    val id :Int,
    @ColumnInfo(name = "grocery_image")
    val image :String,
    @ColumnInfo(name = "name")
    val name :String,
    @ColumnInfo(name = "grocery_description")
    val description :String,
    @ColumnInfo(name = "grocery_price")
    val price :BigDecimal,
)
