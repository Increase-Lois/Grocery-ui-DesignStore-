package com.semicolon.africa.ui_storedesign.di

import android.app.Application
import androidx.room.Room
import com.semicolon.africa.ui_storedesign.data.local.GroceriesDatabase
import com.semicolon.africa.ui_storedesign.data.remote.Api
import com.semicolon.africa.ui_storedesign.data.repositories.GroceryRepositoryImpl
import com.semicolon.africa.ui_storedesign.data.repositories.UserRepositoryImpl
import com.semicolon.africa.ui_storedesign.domain.repositories.GroceryRepository
import com.semicolon.africa.ui_storedesign.domain.repositories.UserRepository
import com.semicolon.africa.ui_storedesign.domain.usecases.auth.AuthenticationUseCases
import com.semicolon.africa.ui_storedesign.domain.usecases.auth.Login
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    val baseUrl = "https://gorceriesonline.herokuapp.com/"

    @Singleton
    @Provides
    fun provideOkHttpClient():OkHttpClient{
        return OkHttpClient.Builder().build()
    }
    @Singleton
    @Provides
    fun provideGroceriesApi(client:OkHttpClient):Api{
        return Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(baseUrl).client(client).build()
                .create(Api::class.java)
    }

    @Provides
    @Singleton
    fun provideUserRepository(api:Api):UserRepository{
        return UserRepositoryImpl(api = api)
    }
    @Provides
    @Singleton
    fun provideAuthenticationUseCases(repository: UserRepository):AuthenticationUseCases{
        return AuthenticationUseCases(
            login = Login(
                userRepository = repository
            )
        )
    }

    @Provides
    @Singleton
    fun provideGroceriesDatabase(app:Application):GroceriesDatabase{
        return Room.databaseBuilder(
            app,
        GroceriesDatabase::class.java,
        GroceriesDatabase.DATABASE_NAME
        ).build()
    }

    @Provides
    @Singleton
    fun provideGroceriesRepository(db:GroceriesDatabase):GroceryRepository{
        return GroceryRepositoryImpl(groceryDao =db.groceryDao)
    }
}