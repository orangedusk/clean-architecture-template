package com.orangedusk.mytemplate.common.util;

import android.view.View;

import androidx.databinding.BindingAdapter;

public class BindingAdapters {
    @BindingAdapter("visibleGone")
    public static void visibleGone (View view, boolean show){
        view.setVisibility(show? View.VISIBLE: View.GONE);
    }

    @BindingAdapter("visibleInvisible")
    public static void visibleInvisible (View view, boolean show){
        view.setVisibility(show? View.VISIBLE: View.INVISIBLE);
    }

}
