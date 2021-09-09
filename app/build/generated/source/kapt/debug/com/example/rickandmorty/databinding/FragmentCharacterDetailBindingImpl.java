package com.example.rickandmorty.databinding;
import com.example.rickandmorty.R;
import com.example.rickandmorty.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentCharacterDetailBindingImpl extends FragmentCharacterDetailBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentCharacterDetailBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private FragmentCharacterDetailBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.appcompat.widget.AppCompatImageView) bindings[3]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[1]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[4]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[2]
            );
        this.gender.setTag(null);
        this.ivAvatar.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.status.setTag(null);
        this.tvName.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.viewModel == variableId) {
            setViewModel((com.example.rickandmorty.ui.detail.CharacterDetailViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.example.rickandmorty.ui.detail.CharacterDetailViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelCharacterData((androidx.databinding.ObservableField<com.example.rickandmorty.local.entity.CharacterEntity>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelCharacterData(androidx.databinding.ObservableField<com.example.rickandmorty.local.entity.CharacterEntity> ViewModelCharacterData, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String viewModelCharacterDataName = null;
        java.lang.String viewModelCharacterDataStatus = null;
        java.lang.String viewModelCharacterDataGender = null;
        java.lang.String viewModelCharacterDataImageURL = null;
        com.example.rickandmorty.local.entity.CharacterEntity viewModelCharacterDataGet = null;
        com.example.rickandmorty.ui.detail.CharacterDetailViewModel viewModel = mViewModel;
        androidx.databinding.ObservableField<com.example.rickandmorty.local.entity.CharacterEntity> viewModelCharacterData = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (viewModel != null) {
                    // read viewModel.characterData
                    viewModelCharacterData = viewModel.getCharacterData();
                }
                updateRegistration(0, viewModelCharacterData);


                if (viewModelCharacterData != null) {
                    // read viewModel.characterData.get()
                    viewModelCharacterDataGet = viewModelCharacterData.get();
                }


                if (viewModelCharacterDataGet != null) {
                    // read viewModel.characterData.get().name
                    viewModelCharacterDataName = viewModelCharacterDataGet.getName();
                    // read viewModel.characterData.get().status
                    viewModelCharacterDataStatus = viewModelCharacterDataGet.getStatus();
                    // read viewModel.characterData.get().gender
                    viewModelCharacterDataGender = viewModelCharacterDataGet.getGender();
                    // read viewModel.characterData.get().imageURL
                    viewModelCharacterDataImageURL = viewModelCharacterDataGet.getImageURL();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            com.example.rickandmorty.di.BindersKt.setGender(this.gender, viewModelCharacterDataGender);
            com.example.rickandmorty.di.BindersKt.loadUrl(this.ivAvatar, viewModelCharacterDataImageURL);
            com.example.rickandmorty.di.BindersKt.setStatus(this.status, viewModelCharacterDataStatus);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvName, viewModelCharacterDataName);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.characterData
        flag 1 (0x2L): viewModel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}