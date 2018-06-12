package com.example.jiaji.daggertest.coffee10_test_subcomponent_dependencies;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import dagger.Reusable;

/**
 * author: xujiaji
 * created on: 2018/5/9 10:27
 * description:
 */
@Module
public class WModule
{
    @Provides
    public Water provideWater()
    {
        return new Water();
    }
}
