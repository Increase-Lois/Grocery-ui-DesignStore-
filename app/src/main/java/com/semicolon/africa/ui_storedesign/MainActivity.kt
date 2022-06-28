package com.semicolon.africa.ui_storedesign

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.semicolon.africa.ui_storedesign.ui.theme.UIStoreDesignTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            UIStoreDesignTheme {
               GroceriesSwitch()
            }
        }
    }
}
