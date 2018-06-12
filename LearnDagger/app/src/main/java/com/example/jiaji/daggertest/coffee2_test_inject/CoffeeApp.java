package com.example.jiaji.daggertest.coffee2_test_inject;

/**
 * 出咖啡测试
 */
public class CoffeeApp {
    public static void main(String[] args) {
        Thermosiphon pump = DaggerPumpComponent.create().getPump();
        pump.heater.on();
        pump.pump();
    }
}
