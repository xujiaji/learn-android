package com.example.jiaji.daggertest.coffee;

import javax.inject.Inject;


public class LazyEntity {
    @Inject
    public LazyEntity()
    {
        System.out.println("LazyEntity()");
    }
}
