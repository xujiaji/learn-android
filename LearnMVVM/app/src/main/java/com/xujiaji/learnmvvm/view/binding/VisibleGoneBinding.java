package com.xujiaji.learnmvvm.view.binding;

import android.databinding.BindingAdapter;
import android.view.View;

public class VisibleGoneBinding
{
    @BindingAdapter("visibleGone")
    public static void showHide(View view, boolean show) {
        view.setVisibility(show ? View.VISIBLE : View.GONE);
    }
}