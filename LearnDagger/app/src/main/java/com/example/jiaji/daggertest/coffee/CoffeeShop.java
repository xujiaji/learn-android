package com.example.jiaji.daggertest.coffee;

import dagger.Component;

@Component(modules = {DripCoffeeModule.class, FooModule.class})
public interface CoffeeShop {
    CoffeeMaker maker();
}
