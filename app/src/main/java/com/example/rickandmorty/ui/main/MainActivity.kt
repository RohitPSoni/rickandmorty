package com.example.rickandmorty.ui.main

import androidx.lifecycle.ViewModel
import com.example.rickandmorty.R
import com.example.rickandmorty.base.BaseActivity
import com.example.rickandmorty.databinding.ActivityMainBinding

class MainActivity : BaseActivity<ActivityMainBinding>() {

    override fun getLayoutId(): Int = R.layout.activity_main

    override fun getViewModel(): ViewModel? = null
}