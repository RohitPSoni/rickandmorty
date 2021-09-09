package com.example.rickandmorty.ui.detail

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.rickandmorty.BR
import com.example.rickandmorty.databinding.ItemEpisodesBinding
import com.example.rickandmorty.ui.detail.EpisodesAdapter.EpisodeViewHolder

class EpisodesAdapter(private val episodeList: List<String>) :
    RecyclerView.Adapter<EpisodeViewHolder>() {

    class EpisodeViewHolder(private val binding: ItemEpisodesBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(url: String) {
            with(binding) {
                setVariable(BR.episode, url)
                executePendingBindings()
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EpisodeViewHolder =
        EpisodeViewHolder(
            ItemEpisodesBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )

    override fun onBindViewHolder(holder: EpisodeViewHolder, position: Int) {
        holder.bind(episodeList[position])
    }

    override fun getItemCount(): Int = episodeList.size
}