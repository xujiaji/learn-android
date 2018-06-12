package com.example.jiaji.daggertest.coffee;

import dagger.BindsOptionalOf;
import dagger.Module;

@Module
public interface FooModule
{
    @BindsOptionalOf
    BindsOptionalEntity bindOptionalEntity();
}
