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
import com.example.rickandmorty.ui.detail.CharacterDetailViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentCharacterDetailBinding extends ViewDataBinding {
  @NonNull
  public final AppCompatImageView gender;

  @NonNull
  public final AppCompatImageView ivAvatar;

  @NonNull
  public final AppCompatTextView status;

  @NonNull
  public final AppCompatTextView tvName;

  @Bindable
  protected CharacterDetailViewModel mViewModel;

  protected FragmentCharacterDetailBinding(Object _bindingComponent, View _root,
      int _localFieldCount, AppCompatImageView gender, AppCompatImageView ivAvatar,
      AppCompatTextView status, AppCompatTextView tvName) {
    super(_bindingComponent, _root, _localFieldCount);
    this.gender = gender;
    this.ivAvatar = ivAvatar;
    this.status = status;
    this.tvName = tvName;
  }

  public abstract void setViewModel(@Nullable CharacterDetailViewModel viewModel);

  @Nullable
  public CharacterDetailViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static FragmentCharacterDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_character_detail, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentCharacterDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentCharacterDetailBinding>inflateInternal(inflater, R.layout.fragment_character_detail, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentCharacterDetailBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_character_detail, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentCharacterDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentCharacterDetailBinding>inflateInternal(inflater, R.layout.fragment_character_detail, null, false, component);
  }

  public static FragmentCharacterDetailBinding bind(@NonNull View view) {
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
  public static FragmentCharacterDetailBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (FragmentCharacterDetailBinding)bind(component, view, R.layout.fragment_character_detail);
  }
}