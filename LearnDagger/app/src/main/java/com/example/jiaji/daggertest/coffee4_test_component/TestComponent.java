package com.example.jiaji.daggertest.coffee4_test_component;

import dagger.Component;

@Component(modules = MNModule.class)
public interface TestComponent
{
    void inject(MNActivity me);
}
