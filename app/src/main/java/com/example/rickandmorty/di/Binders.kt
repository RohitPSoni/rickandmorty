package com.example.rickandmorty.di

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.BindingAdapter
import com.example.rickandmorty.ext.load

@BindingAdapter("imageUrl")
fun loadUrl(view: ImageView, url: String?) {
    view.load(url)
}

@BindingAdapter("status")
fun setStatus(view: TextView, status: String?) {
    view.apply {
        visibility = if (status.equals("dead", ignoreCase = true)) {
            View.VISIBLE
        } else {
            View.GONE
        }
    }
}