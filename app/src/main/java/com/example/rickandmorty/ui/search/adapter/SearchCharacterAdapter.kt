package com.example.rickandmorty.ui.search.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.view.ViewCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.rickandmorty.BR
import com.example.rickandmorty.databinding.ItemCharacterBinding
import com.example.rickandmorty.ext.clear
import com.example.rickandmorty.ext.load
import com.example.rickandmorty.local.entity.CharacterEntity
import com.example.rickandmorty.ui.search.adapter.SearchCharacterAdapter.SearchCharacterViewHolder

class SearchCharacterAdapter(
    private val callback:
        (binding: ItemCharacterBinding, character: CharacterEntity) -> Unit
) :
    RecyclerView
    .Adapter<SearchCharacterViewHolder>() {

    inner class SearchCharacterViewHolder(private val binding: ItemCharacterBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(item: CharacterEntity) {
            binding.apply {
                setVariable(BR.character, item)
                executePendingBindings()
                ivAvatar.apply {
                    clear()
                    load(item.imageURL)
                }
                root.setOnClickListener {
                    ViewCompat.setTransitionName(binding.ivAvatar, "avatar_${item.id}")
                    ViewCompat.setTransitionName(binding.tvName, "name_${item.id}")
                    callback.invoke(binding, item)
                }
            }
        }
    }

    private val filteredList = mutableListOf<CharacterEntity>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SearchCharacterViewHolder =
        SearchCharacterViewHolder(
            ItemCharacterBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )

    override fun onBindViewHolder(holder: SearchCharacterViewHolder, position: Int) {
        holder.bind(filteredList[position])
    }

    override fun getItemCount(): Int = filteredList.size

    fun addData(list: List<CharacterEntity>) {
        filteredList.clear()
        filteredList.addAll(list)
        notifyDataSetChanged()
    }
}