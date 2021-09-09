package com.example.rickandmorty.databinding;
import com.example.rickandmorty.R;
import com.example.rickandmorty.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentSearchCharacterBindingImpl extends FragmentSearchCharacterBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.searchTextView, 2);
        sViewsWithIds.put(R.id.rv_characters, 3);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentSearchCharacterBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private FragmentSearchCharacterBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.ProgressBar) bindings[1]
            , (androidx.recyclerview.widget.RecyclerView) bindings[3]
            , (androidx.appcompat.widget.AppCompatEditText) bindings[2]
            );
        this.loader.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
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
            setViewModel((com.example.rickandmorty.ui.characters.search.SearchCharacterViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.example.rickandmorty.ui.characters.search.SearchCharacterViewModel ViewModel) {
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
                return onChangeViewModelShowProgress((androidx.databinding.ObservableField<java.lang.Integer>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelShowProgress(androidx.databinding.ObservableField<java.lang.Integer> ViewModelShowProgress, int fieldId) {
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
        int androidxDatabindingViewDataBindingSafeUnboxViewModelShowProgressGet = 0;
        java.lang.Integer viewModelShowProgressGet = null;
        com.example.rickandmorty.ui.characters.search.SearchCharacterViewModel viewModel = mViewModel;
        androidx.databinding.ObservableField<java.lang.Integer> viewModelShowProgress = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (viewModel != null) {
                    // read viewModel.showProgress
                    viewModelShowProgress = viewModel.getShowProgress();
                }
                updateRegistration(0, viewModelShowProgress);


                if (viewModelShowProgress != null) {
                    // read viewModel.showProgress.get()
                    viewModelShowProgressGet = viewModelShowProgress.get();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showProgress.get())
                androidxDatabindingViewDataBindingSafeUnboxViewModelShowProgressGet = androidx.databinding.ViewDataBinding.safeUnbox(viewModelShowProgressGet);
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            this.loader.setVisibility(androidxDatabindingViewDataBindingSafeUnboxViewModelShowProgressGet);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.showProgress
        flag 1 (0x2L): viewModel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}