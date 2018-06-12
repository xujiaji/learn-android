package com.example.jiaji.daggertest.coffee3_test_provides_module;


/**
 * 测试
 */
public class CoffeeApp
{
    public static void main(String[] args) {
        System.out.println(
                DaggerCoffeeShop
                        .builder()
                        .dripCoffeeModule(new DripCoffeeModule("Hello world"))
                        .build()
                        .getTestModuleAttr());
//        Pump pump = DaggerCoffeeShop.create().getPump();
//        System.out.println("pump = " + pump);
//        pump.pump();
    }
}
