package com.xujiaji.learnmvvm.di;

import android.app.Application;

import com.xujiaji.learnmvvm.App;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjectionModule;

/**
 * author: xujiaji
 * created on: 2018/6/12 11:51
 * description:
 */
@Singleton
@Component(modules = {
        AndroidInjectionModule.class,
        AppModule.class,
        MainActivityModule.class
})
public interface AppComponent
{
    @Component.Builder
    interface Builder
    {
        @BindsInstance Builder application(Application application);
        AppComponent build();
    }

    void inject(App app);
}
