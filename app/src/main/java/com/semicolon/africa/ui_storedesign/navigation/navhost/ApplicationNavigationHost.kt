import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.semicolon.africa.ui_storedesign.cart.screens.Cart
import com.semicolon.africa.ui_storedesign.explore.screens.Explore
import com.semicolon.africa.ui_storedesign.favorites.screens.Favorites
import com.semicolon.africa.ui_storedesign.general.components.BottomNavBar
import com.semicolon.africa.ui_storedesign.navigation.destination.PrimaryDestination
import com.semicolon.africa.ui_storedesign.profile.screens.Profile
import com.semicolon.africa.ui_storedesign.store.screens.Store

@Composable
fun ApplcationNavigationHost(){
    val navController = rememberNavController()
    Scaffold (
        bottomBar ={
            BottomNavBar(
                modifier = Modifier.fillMaxWidth(),
                navController = navController
            )
        }
    ){
        NavHost(
            navController = navController,
            startDestination = PrimaryDestination.Store.startRoute
        ){
            composable(route=PrimaryDestination.Store.startRoute){
                Store()
            }
            composable(route = PrimaryDestination.Explore.startRoute){
                Explore()
            }
            composable(route = PrimaryDestination.Cart.startRoute){
              Cart()
            }
            composable(route = PrimaryDestination.Favorite.startRoute){
                Favorites()
            }
            composable(route =PrimaryDestination.Profile.startRoute){
                Profile()
            }
        }
    }
}