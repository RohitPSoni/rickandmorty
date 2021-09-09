package com.example.rickandmorty.ui.detail

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavArgs
import com.example.rickandmorty.local.entity.CharacterEntity
import java.io.Serializable
import java.lang.IllegalArgumentException
import java.lang.UnsupportedOperationException
import kotlin.Suppress
import kotlin.jvm.JvmStatic

public data class CharacterDetailFragmentArgs(
  public val characterExtra: CharacterEntity
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toBundle(): Bundle {
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

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): CharacterDetailFragmentArgs {
      bundle.setClassLoader(CharacterDetailFragmentArgs::class.java.classLoader)
      val __characterExtra : CharacterEntity?
      if (bundle.containsKey("character_extra")) {
        if (Parcelable::class.java.isAssignableFrom(CharacterEntity::class.java) ||
            Serializable::class.java.isAssignableFrom(CharacterEntity::class.java)) {
          __characterExtra = bundle.get("character_extra") as CharacterEntity?
        } else {
          throw UnsupportedOperationException(CharacterEntity::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__characterExtra == null) {
          throw IllegalArgumentException("Argument \"character_extra\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"character_extra\" is missing and does not have an android:defaultValue")
      }
      return CharacterDetailFragmentArgs(__characterExtra)
    }
  }
}
