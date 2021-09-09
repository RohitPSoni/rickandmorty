package com.example.rickandmorty.ui.characters.search

import android.os.Bundle
import androidx.core.widget.addTextChangedListener
import androidx.lifecycle.ViewModel
import androidx.navigation.fragment.FragmentNavigatorExtras
import androidx.navigation.fragment.findNavController
import com.example.rickandmorty.R
import com.example.rickandmorty.base.BaseFragment
import com.example.rickandmorty.databinding.FragmentSearchCharacterBinding
import com.example.rickandmorty.ui.characters.search.adapter.SearchCharacterAdapter
import org.koin.androidx.viewmodel.ext.android.viewModel

class SearchCharacterFragment : BaseFragment<FragmentSearchCharacterBinding>() {

    private val searchViewModel: SearchCharacterViewModel by viewModel()

    override fun getViewModel(): ViewModel = searchViewModel

    override fun getLayoutId(): Int = R.layout.fragment_search_character

    private lateinit var adapter: SearchCharacterAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        searchViewModel.filteredList.observe(this, {
            adapter.addData(it)
        })
    }

    override fun bindData() {
        adapter = SearchCharacterAdapter { itemBinding, character ->
            val extras = FragmentNavigatorExtras(
                itemBinding.ivAvatar to "avatar_${character.id}",
                itemBinding.tvName to "name_${character.id}",
            )
            findNavController().navigate(
                SearchCharacterFragmentDirections.actionSearchCharacterFragmentToCharacterDetailFragment(
                    character.id
                ),
                extras
            )
        }
        with(viewBinder){
            rvCharacters.adapter = adapter
            searchTextView.addTextChangedListener {
                searchViewModel.searchDebounced(it?.toString())
            }
        }
    }
}