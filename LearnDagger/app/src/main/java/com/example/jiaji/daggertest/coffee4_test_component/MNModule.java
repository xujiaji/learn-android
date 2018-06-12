package com.example.jiaji.daggertest.coffee4_test_component;

import dagger.Module;
import dagger.Provides;

@Module
public class MNModule
{
    MNActivity mnActivity;
    public MNModule(MNActivity mnActivity)
    {
        this.mnActivity = mnActivity;
    }

    @Provides
    MNActivity provedesActivity()
    {
        return mnActivity;
    }
}
