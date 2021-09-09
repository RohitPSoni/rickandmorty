package com.example.rickandmorty.ui.detail

import android.os.Bundle
import androidx.core.view.ViewCompat
import androidx.lifecycle.ViewModel
import androidx.navigation.fragment.navArgs
import androidx.transition.TransitionInflater
import com.example.rickandmorty.R
import com.example.rickandmorty.base.BaseFragment
import com.example.rickandmorty.databinding.FragmentCharacterDetailBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class CharacterDetailFragment :
    BaseFragment<FragmentCharacterDetailBinding>() {

    private val characterDetailViewModel: CharacterDetailViewModel by viewModel()

    override fun getLayoutId() = R.layout.fragment_character_detail

    override fun getViewModel(): ViewModel = characterDetailViewModel

    private val args: CharacterDetailFragmentArgs by navArgs()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        sharedElementEnterTransition =
            TransitionInflater.from(context).inflateTransition(android.R.transition.move)
    }

    override fun bindData() {
        characterDetailViewModel.setCharacter(args.characterExtra)
        ViewCompat.setTransitionName(viewBinder.ivAvatar, "avatar_${args.characterExtra.id}")
        ViewCompat.setTransitionName(viewBinder.tvName, "name_${args.characterExtra.id}")
    }
}