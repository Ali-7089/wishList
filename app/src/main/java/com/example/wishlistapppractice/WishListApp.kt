package com.example.wishlistapppractice

import android.app.Application

class WishListApp:Application() {
    override fun onCreate() {
        super.onCreate()
        Graph.provide(this)
    }
}