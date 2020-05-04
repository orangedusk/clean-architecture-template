package com.orangedusk.mytemplate.common.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.ViewModel;

/*
Base class for all viewmodel classes
 */
public abstract class BaseViewModel extends ViewModel {

    public abstract void refreshData();
}
