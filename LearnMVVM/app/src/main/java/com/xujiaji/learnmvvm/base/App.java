package com.xujiaji.learnmvvm.base;

import android.app.Activity;
import android.app.Application;

import com.xujiaji.learnmvvm.di.AppInjector;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasActivityInjector;

/**
 * author: xujiaji
 * created on: 2018/6/12 11:49
 * description:
 */
public class App extends Application implements HasActivityInjector
{
    @Inject
    DispatchingAndroidInjector<Activity> dispatchingAndroidInjector;

    @Override
    public void onCreate()
    {
        super.onCreate();
        AppInjector.init(this);
    }

    @Override
    public AndroidInjector<Activity> activityInjector()
    {
        return dispatchingAndroidInjector;
    }
}
