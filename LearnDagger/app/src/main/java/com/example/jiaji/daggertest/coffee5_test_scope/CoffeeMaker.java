package com.example.jiaji.daggertest.coffee5_test_scope;

import javax.inject.Inject;

/**
 * 咖啡机
 */
public class CoffeeMaker {
    @Inject
    Heater heater;//当我们要使用它时才创建一个加热器
    @Inject
    Pump pump;//汞
//    @Inject
//    SingletonTest singletonTest1;
//    @Inject
//    SingletonTest singletonTest2;
//    @Inject
//    SingletonTest singletonTest3;

    @Inject
    CoffeeMaker() { }

    public void brew() {
        System.out.println("CoffeeMaker - heaterHash = " + heater.hashCode());
        heater.on();
        pump.pump();
        System.out.println("[_]P coffee! [_]P");
        heater.off();
//        System.out.println(
//                "singletonTest1 = " + singletonTest1.hashCode() + "\n"
//                + "singletonTest2 = " + singletonTest2.hashCode() + "\n"
//                + "singletonTest3 = " + singletonTest3.hashCode() + "\n");
    }
}
