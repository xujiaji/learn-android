package com.example.jiaji.daggertest.coffee8_test_optional_binding;

import dagger.Module;
import dagger.Provides;

/**
 * author: xujiaji
 * created on: 2018/5/8 20:28
 * description:
 */
@Module
public class CoffeeModule
{
    @Provides
    public Coffee provideCoffee()
    {
        return new Coffee();
    }
}
