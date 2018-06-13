package com.xujiaji.learnmvvm.base;

import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProviders;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.xujiaji.learnmvvm.di.Injectable;
import com.xujiaji.learnmvvm.util.ClassUtils;
import javax.inject.Inject;

/**
 * author: xujiaji
 * created on: 2018/6/13 13:49
 * description: Fragment基类
 */
public abstract class BaseFragment<B extends ViewDataBinding, VM extends AndroidViewModel> extends Fragment implements Injectable
{
    @Inject
    protected ViewModelProvider.Factory mViewModelFactory;

    protected B binding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        binding = ClassUtils.getBinding(this, inflater, container);
        onBinding(binding);
        return binding.getRoot();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState)
    {
        super.onActivityCreated(savedInstanceState);
        Class<VM> viewModelClass = ClassUtils.getViewModel(this);
        final VM viewModel = ViewModelProviders.of(this, mViewModelFactory).get(viewModelClass);
        onObserveViewModel(viewModel);
    }

    /**
     * 实例化Binding后调用该方法
     */
    protected abstract void onBinding(B binding);

    /**
     * 实例化ViewModel后调用该方法
     */
    protected abstract void onObserveViewModel(VM viewModel);
}
