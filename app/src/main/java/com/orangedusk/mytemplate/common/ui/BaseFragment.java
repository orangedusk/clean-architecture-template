package com.orangedusk.mytemplate.common.ui;

import androidx.fragment.app.Fragment;

import com.orangedusk.mytemplate.common.viewmodel.BaseViewModel;

public abstract class BaseFragment extends Fragment {
    protected BaseViewModel mViewModel;
    public BaseFragment(){
        // Required empty constructor
    }

    public void refreshData(){
        mViewModel.refreshData();
    }
}
