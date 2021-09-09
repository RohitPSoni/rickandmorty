package com.example.rickandmorty.ui.characters

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.example.rickandmorty.R
import com.example.rickandmorty.local.entity.CharacterEntity
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Int
import kotlin.Suppress

public class CharactersFragmentDirections private constructor() {
  private data class ActionCharactersFragmentToCharacterDetailFragment(
    public val characterExtra: CharacterEntity
  ) : NavDirections {
    public override fun getActionId(): Int =
        R.id.action_charactersFragment_to_characterDetailFragment

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
    public fun actionCharactersFragmentToCharacterDetailFragment(characterExtra: CharacterEntity):
        NavDirections = ActionCharactersFragmentToCharacterDetailFragment(characterExtra)

    public fun actionCharactersFragmentToSearchCharacterFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_charactersFragment_to_searchCharacterFragment)
  }
}
