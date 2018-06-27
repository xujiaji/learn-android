package com.example.jiaji.daggertest.coffee3_test_provides_module;

import dagger.Binds;
import dagger.Module;

/**
 * author: xujiaji
 * created on: 2018/6/27 11:04
 * description:
 */
@Module
public abstract class BModule
{
    @Binds
    abstract Pump bindPump(Thermosiphon pump);
}
