package com.example.jiaji.daggertest.coffee5_test_scope;


import dagger.Component;

@Component(modules = {DripCoffeeModule.class})
public interface CoffeeShop {
    CoffeeMaker maker();
}
