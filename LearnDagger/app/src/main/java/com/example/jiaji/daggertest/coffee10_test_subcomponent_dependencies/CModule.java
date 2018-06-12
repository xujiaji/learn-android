package com.example.jiaji.daggertest.coffee10_test_subcomponent_dependencies;

import dagger.Module;
import dagger.Provides;

/**
 * author: xujiaji
 * created on: 2018/5/9 10:26
 * description:
 */
@Module
public class CModule
{
    @Provides
    public Coffee provideCoffee(Water water)
    {
        return new Coffee(water);
    }
}
