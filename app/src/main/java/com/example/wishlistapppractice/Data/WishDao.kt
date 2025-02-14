package com.example.wishlistapppractice.Data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow

@Dao
abstract class WishDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    abstract fun addWish(wishEntity:Wish)

    @Query("Select * from `wish-table`")
    abstract fun getAllWishes(): Flow<List<Wish>>

    @Update()
    abstract fun updateWish(wishEntity: Wish)

    @Delete
    abstract  fun deleteWish(wishEntity: Wish)

    @Query("Select * from `wish-table` where id =:id ")
    abstract  fun getWishById(id:Int):Flow<Wish>
}