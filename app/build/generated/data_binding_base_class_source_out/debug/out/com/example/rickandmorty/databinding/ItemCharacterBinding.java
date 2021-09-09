// Generated by data binding compiler. Do not edit!
package com.example.rickandmorty.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.rickandmorty.R;
import com.example.rickandmorty.local.entity.CharacterEntity;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ItemCharacterBinding extends ViewDataBinding {
  @NonNull
  public final View backgroundView;

  @NonNull
  public final AppCompatTextView dead;

  @NonNull
  public final AppCompatImageView ivAvatar;

  @NonNull
  public final AppCompatTextView tvName;

  @Bindable
  protected CharacterEntity mCharacter;

  protected ItemCharacterBinding(Object _bindingComponent, View _root, int _localFieldCount,
      View backgroundView, AppCompatTextView dead, AppCompatImageView ivAvatar,
      AppCompatTextView tvName) {
    super(_bindingComponent, _root, _localFieldCount);
    this.backgroundView = backgroundView;
    this.dead = dead;
    this.ivAvatar = ivAvatar;
    this.tvName = tvName;
  }

  public abstract void setCharacter(@Nullable CharacterEntity character);

  @Nullable
  public CharacterEntity getCharacter() {
    return mCharacter;
  }

  @NonNull
  public static ItemCharacterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_character, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ItemCharacterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ItemCharacterBinding>inflateInternal(inflater, R.layout.item_character, root, attachToRoot, component);
  }

  @NonNull
  public static ItemCharacterBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_character, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ItemCharacterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ItemCharacterBinding>inflateInternal(inflater, R.layout.item_character, null, false, component);
  }

  public static ItemCharacterBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ItemCharacterBinding bind(@NonNull View view, @Nullable Object component) {
    return (ItemCharacterBinding)bind(component, view, R.layout.item_character);
  }
}
