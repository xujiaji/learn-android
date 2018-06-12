package com.example.jiaji.daggertest.coffee2_test_inject;


import javax.inject.Inject;

/**
 * 热虹吸
 */
public class Thermosiphon implements Pump {

    @Inject
    ElectricHeater heater;

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
