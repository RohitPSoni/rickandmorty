package com.example.rickandmorty.ui.characters.search

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavDirections
import com.example.rickandmorty.R
import com.example.rickandmorty.local.entity.CharacterEntity
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Int
import kotlin.Suppress

public class SearchCharacterFragmentDirections private constructor() {
  private data class ActionSearchCharacterFragmentToCharacterDetailFragment(
    public val characterExtra: CharacterEntity
  ) : NavDirections {
    public override fun getActionId(): Int =
        R.id.action_searchCharacterFragment_to_characterDetailFragment

    @Suppress("CAST_NEVER_SUCCEEDS")
    public override fun getArguments(): Bundle {
      val result = Bundle()
      if (Parcelable::class.java.isAssignableFrom(CharacterEntity::class.java)) {
        result.putParcelable("character_extra", this.characterExtra as Parcelable)
      } else if (Serializable::class.java.isAssignableFrom(CharacterEntity::class.java)) {
        result.putSerializable("character_extra", this.characterExtra as Serializable)
      } else {
        throw UnsupportedOperationException(CharacterEntity::class.java.name +
            " must implement Parcelable or Serializable or must be an Enum.")
      }
      return result
    }
  }

  public companion object {
    public
        fun actionSearchCharacterFragmentToCharacterDetailFragment(characterExtra: CharacterEntity):
        NavDirections = ActionSearchCharacterFragmentToCharacterDetailFragment(characterExtra)
  }
}
