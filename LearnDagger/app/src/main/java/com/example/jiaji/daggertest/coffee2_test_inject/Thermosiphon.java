package com.example.jiaji.daggertest.coffee2_test_inject;


import javax.inject.Inject;

/**
 * 热虹吸
 */
public class Thermosiphon implements Pump {

    @Inject
    ElectricHeater heater;

//    @Inject
//    public void funTest()
//    {
//        System.out.println("funTest()");
//    }
//
//    @Inject
//    public void funTest(ElectricHeater heater)
//    {
//        System.out.println("heater: " + this.heater.hashCode());
//        System.out.println("funTest(): " + heater.hashCode());
//    }

    @Inject
    public Thermosiphon() {

    }

    @Override
    public void pump() {
        if (heater.isHot()) {
            System.out.println("=>=> 抽水 =>=>");
        }
    }
}
