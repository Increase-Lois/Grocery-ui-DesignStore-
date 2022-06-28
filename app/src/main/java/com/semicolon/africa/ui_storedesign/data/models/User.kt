package com.semicolon.africa.ui_storedesign.data.models

import com.google.gson.annotations.SerializedName

data class User(
    @SerializedName("_id")
    val id : String,
    val email: String,
    val firstname:String,
    val lastname :String

)
