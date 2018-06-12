package com.example.jiaji.daggertest.coffee8_test_optional_binding;

import dagger.BindsOptionalOf;
import dagger.Module;

/**
 * author: xujiaji
 * created on: 2018/5/8 20:36
 * description:
 */
@Module
public abstract class CModule
{
    @BindsOptionalOf
    public abstract Coffee optionalCoffee();
}
