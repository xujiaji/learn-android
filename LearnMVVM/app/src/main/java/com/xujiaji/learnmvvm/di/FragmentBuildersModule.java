package com.xujiaji.learnmvvm.di;

import com.xujiaji.learnmvvm.view.ui.ProjectFragment;
import com.xujiaji.learnmvvm.view.ui.ProjectListFragment;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * author: xujiaji
 * created on: 2018/6/12 13:44
 * description:
 */
@Module
public abstract class FragmentBuildersModule
{
    @ContributesAndroidInjector
    abstract ProjectFragment contributeProjectFragment();

    @ContributesAndroidInjector
    abstract ProjectListFragment contributeProjectListFragment();
}
