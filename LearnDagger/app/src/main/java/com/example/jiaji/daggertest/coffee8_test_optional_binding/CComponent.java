package com.example.jiaji.daggertest.coffee8_test_optional_binding;

import dagger.Component;

/**
 * author: xujiaji
 * created on: 2018/5/8 20:30
 * description:
 */
@Component(modules = {CoffeeModule.class, CModule.class})
public interface CComponent
{
    Cup getCup();
}
