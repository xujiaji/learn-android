package com.example.jiaji.daggertest.coffee;


public class CoffeeApp {

    public static void main(String[] args)
    {
        CoffeeShop coffeeShop = DaggerCoffeeShop.builder()
                .dripCoffeeModule(new DripCoffeeModule(""))
                .build();
        coffeeShop.maker().brew();

        AppComponent appComponent = DaggerAppComponent
                .builder()
                .userName("xujiaji")
                .password("0123456789")
                .build();
        System.out.println(appComponent.app());
        System.out.println(appComponent.boeUserName());
        System.out.println(appComponent.boePassword());

    }
}
