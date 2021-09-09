package com.example.rickandmorty.ext

import android.widget.ImageView
import com.example.rickandmorty.R
import com.example.rickandmorty.di.GlideApp

fun ImageView.clear() {
    GlideApp.with(context).clear(this)
}

fun ImageView.load(url: String?) {
    GlideApp.with(context)
        .load(url)
        .override(400, 400)
        .placeholder(R.drawable.ic_launcher_background)
        .into(this)
}