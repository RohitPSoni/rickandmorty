package com.example.rickandmorty.ui.characters.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.view.ViewCompat
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.rickandmorty.BR
import com.example.rickandmorty.service.model.Character
import com.example.rickandmorty.databinding.ItemCharacterBinding
import com.example.rickandmorty.ext.clear
import com.example.rickandmorty.ext.load
import com.example.rickandmorty.local.entity.CharacterEntity

class CharacterAdapter(
    private val callback:
        (binding: ItemCharacterBinding, character: CharacterEntity) -> Unit
) :
    PagingDataAdapter<CharacterEntity, CharacterAdapter.CharacterViewHolder>(CharacterComparator) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        CharacterViewHolder(
            ItemCharacterBinding.inflate(
                LayoutInflater.from(parent.context), parent, false
            )
        )

    override fun onBindViewHolder(holder: CharacterViewHolder, position: Int) {
        getItem(position)?.let { holder.bind(it) }
    }

    inner class CharacterViewHolder(private val binding: ItemCharacterBinding) :
        RecyclerView.ViewHolder(binding.root) {

        init {
            itemView.setOnClickListener {
                val item = getItem(absoluteAdapterPosition) as CharacterEntity
                ViewCompat.setTransitionName(binding.ivAvatar, "avatar_${item.id}")
                ViewCompat.setTransitionName(binding.tvName, "name_${item.id}")
                callback.invoke(binding, item)
            }
        }

        fun bind(item: CharacterEntity) = with(binding) {
            setVariable(BR.character, item)
            executePendingBindings()

            ivAvatar.apply {
                clear()
                load(item.imageURL)
            }
        }
    }

    object CharacterComparator : DiffUtil.ItemCallback<CharacterEntity>() {

        override fun areItemsTheSame(oldItem: CharacterEntity, newItem: CharacterEntity) =
            oldItem.id == newItem.id

        override fun areContentsTheSame(oldItem: CharacterEntity, newItem: CharacterEntity) =
            oldItem == newItem
    }
}