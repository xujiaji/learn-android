package com.example.jiaji.daggertest.coffee3_test_provides_module;


import dagger.Component;
@Component(modules = {DripCoffeeModule.class, BModule.class})
public interface CoffeeShop
{
    Pump getPump();
    TestModuleAttr getTestModuleAttr();
}
