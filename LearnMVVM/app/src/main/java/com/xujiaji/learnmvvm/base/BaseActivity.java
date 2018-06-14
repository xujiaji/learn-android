package com.xujiaji.learnmvvm.base;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.support.HasSupportFragmentInjector;

/**
 * author: xujiaji
 * created on: 2018/6/14 10:44
 * description:
 */
public abstract class BaseActivity extends AppCompatActivity implements HasSupportFragmentInjector
{
    @Inject
    DispatchingAndroidInjector<Fragment> dispatchingAndroidInjector;


    @Override
    public AndroidInjector<Fragment> supportFragmentInjector()
    {
        return dispatchingAndroidInjector;
    }
}
