package com.example.rickandmorty.ui.characters

import androidx.lifecycle.ViewModel
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.FragmentNavigatorExtras
import androidx.navigation.fragment.findNavController
import com.example.rickandmorty.R
import com.example.rickandmorty.base.BaseFragment
import com.example.rickandmorty.databinding.FragmentCharactersBinding
import com.example.rickandmorty.ui.characters.adapter.CharacterAdapter
import com.example.rickandmorty.ui.characters.adapter.PagingLoadStateAdapter
import kotlinx.coroutines.flow.collectLatest
import org.koin.androidx.viewmodel.ext.android.viewModel

class CharactersFragment : BaseFragment<FragmentCharactersBinding>() {

    private val charactersViewModel: CharactersViewModel by viewModel()

    override fun getLayoutId() = R.layout.fragment_characters

    override fun getViewModel(): ViewModel = charactersViewModel

    override fun bindData() {
        val characterAdapter = CharacterAdapter { characterBinding, character ->
            val extras = FragmentNavigatorExtras(
                characterBinding.ivAvatar to "avatar_${character.id}",
                characterBinding.tvName to "name_${character.id}",
            )
            findNavController().navigate(
                CharactersFragmentDirections.actionCharactersFragmentToCharacterDetailFragment(
                    character
                ),
                extras
            )
        }.apply {
            viewBinder.rvCharacters.adapter = withLoadStateHeaderAndFooter(
                header = PagingLoadStateAdapter(this),
                footer = PagingLoadStateAdapter(this)
            )
        }
        lifecycleScope.launchWhenCreated {
            charactersViewModel.charactersFlow.collectLatest {
                characterAdapter.submitData(it)
            }
        }
    }
}