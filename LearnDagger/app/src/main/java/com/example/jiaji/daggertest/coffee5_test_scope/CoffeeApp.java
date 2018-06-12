package com.example.jiaji.daggertest.coffee5_test_scope;


public class CoffeeApp
{
    public static void main(String[] args)
    {
        CoffeeShop coffeeShop = DaggerCoffeeShop.builder()
                .build();
        coffeeShop.maker().brew();
        System.out.println("*************************************");
        coffeeShop.maker().brew();
        System.out.println("*************************************");
        DaggerCoffeeShop.builder()
                .build()
                .maker()
                .brew();
    }
}
