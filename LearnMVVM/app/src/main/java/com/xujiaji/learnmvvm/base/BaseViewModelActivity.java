package com.xujiaji.learnmvvm.base;

import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.xujiaji.learnmvvm.util.ClassUtils;

import javax.inject.Inject;

/**
 * author: xujiaji
 * created on: 2018/6/14 11:27
 * description:
 */
public abstract class BaseViewModelActivity<VM extends AndroidViewModel> extends BaseActivity
{
    @Inject
    protected ViewModelProvider.Factory mViewModelFactory;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        Class<VM> viewModelClass = ClassUtils.getViewModel(this);
        final VM viewModel = ViewModelProviders.of(this, mViewModelFactory).get(viewModelClass);
        onObserveViewModel(viewModel);
    }

    /**
     * 实例化ViewModel后调用该方法
     */
    protected abstract void onObserveViewModel(VM viewModel);
}
