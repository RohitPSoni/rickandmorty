// Generated by data binding compiler. Do not edit!
package com.example.rickandmorty.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.example.rickandmorty.R;
import com.example.rickandmorty.ui.characters.CharactersViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentCharactersBinding extends ViewDataBinding {
  @NonNull
  public final ProgressBar loader;

  @NonNull
  public final RecyclerView rvCharacters;

  @NonNull
  public final AppCompatButton search;

  @Bindable
  protected CharactersViewModel mViewModel;

  protected FragmentCharactersBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ProgressBar loader, RecyclerView rvCharacters, AppCompatButton search) {
    super(_bindingComponent, _root, _localFieldCount);
    this.loader = loader;
    this.rvCharacters = rvCharacters;
    this.search = search;
  }

  public abstract void setViewModel(@Nullable CharactersViewModel viewModel);

  @Nullable
  public CharactersViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static FragmentCharactersBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_characters, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentCharactersBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentCharactersBinding>inflateInternal(inflater, R.layout.fragment_characters, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentCharactersBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_characters, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentCharactersBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentCharactersBinding>inflateInternal(inflater, R.layout.fragment_characters, null, false, component);
  }

  public static FragmentCharactersBinding bind(@NonNull View view) {
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
  public static FragmentCharactersBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentCharactersBinding)bind(component, view, R.layout.fragment_characters);
  }
}