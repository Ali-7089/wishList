package com.example.wishlistapppractice

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.wishlistapppractice.Data.Wish
import com.example.wishlistapppractice.Data.WishDao

@Database(
    entities = [Wish::class],
    version = 1,
    exportSchema = false
)

abstract class WishDatabase :RoomDatabase() {
  abstract fun wishDoa(): WishDao
}