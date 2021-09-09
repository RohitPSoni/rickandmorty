package com.example.rickandmorty;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.example.rickandmorty.databinding.ActivityMainBindingImpl;
import com.example.rickandmorty.databinding.DialogErrorBindingImpl;
import com.example.rickandmorty.databinding.FragmentCharacterDetailBindingImpl;
import com.example.rickandmorty.databinding.FragmentCharactersBindingImpl;
import com.example.rickandmorty.databinding.FragmentSearchCharacterBindingImpl;
import com.example.rickandmorty.databinding.ItemCharacterBindingImpl;
import com.example.rickandmorty.databinding.ItemNetworkStateBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYMAIN = 1;

  private static final int LAYOUT_DIALOGERROR = 2;

  private static final int LAYOUT_FRAGMENTCHARACTERDETAIL = 3;

  private static final int LAYOUT_FRAGMENTCHARACTERS = 4;

  private static final int LAYOUT_FRAGMENTSEARCHCHARACTER = 5;

  private static final int LAYOUT_ITEMCHARACTER = 6;

  private static final int LAYOUT_ITEMNETWORKSTATE = 7;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(7);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.rickandmorty.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.rickandmorty.R.layout.dialog_error, LAYOUT_DIALOGERROR);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.rickandmorty.R.layout.fragment_character_detail, LAYOUT_FRAGMENTCHARACTERDETAIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.rickandmorty.R.layout.fragment_characters, LAYOUT_FRAGMENTCHARACTERS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.rickandmorty.R.layout.fragment_search_character, LAYOUT_FRAGMENTSEARCHCHARACTER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.rickandmorty.R.layout.item_character, LAYOUT_ITEMCHARACTER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.rickandmorty.R.layout.item_network_state, LAYOUT_ITEMNETWORKSTATE);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYMAIN: {
          if ("layout/activity_main_0".equals(tag)) {
            return new ActivityMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
        }
        case  LAYOUT_DIALOGERROR: {
          if ("layout/dialog_error_0".equals(tag)) {
            return new DialogErrorBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for dialog_error is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTCHARACTERDETAIL: {
          if ("layout/fragment_character_detail_0".equals(tag)) {
            return new FragmentCharacterDetailBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_character_detail is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTCHARACTERS: {
          if ("layout/fragment_characters_0".equals(tag)) {
            return new FragmentCharactersBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_characters is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSEARCHCHARACTER: {
          if ("layout/fragment_search_character_0".equals(tag)) {
            return new FragmentSearchCharacterBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_search_character is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMCHARACTER: {
          if ("layout/item_character_0".equals(tag)) {
            return new ItemCharacterBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_character is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMNETWORKSTATE: {
          if ("layout/item_network_state_0".equals(tag)) {
            return new ItemNetworkStateBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_network_state is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(4);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "character");
      sKeys.put(2, "errorMessage");
      sKeys.put(3, "viewModel");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(7);

    static {
      sKeys.put("layout/activity_main_0", com.example.rickandmorty.R.layout.activity_main);
      sKeys.put("layout/dialog_error_0", com.example.rickandmorty.R.layout.dialog_error);
      sKeys.put("layout/fragment_character_detail_0", com.example.rickandmorty.R.layout.fragment_character_detail);
      sKeys.put("layout/fragment_characters_0", com.example.rickandmorty.R.layout.fragment_characters);
      sKeys.put("layout/fragment_search_character_0", com.example.rickandmorty.R.layout.fragment_search_character);
      sKeys.put("layout/item_character_0", com.example.rickandmorty.R.layout.item_character);
      sKeys.put("layout/item_network_state_0", com.example.rickandmorty.R.layout.item_network_state);
    }
  }
}
