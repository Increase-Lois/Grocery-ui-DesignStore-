package com.semicolon.africa.ui_storedesign.navigation.destinations

sealed class Destination(val name : String, val route : String){
    object LoginDestination:Destination(name = "login", route="login")
    object SignupDestination:Destination(name= "signUp", route = "signup")

}