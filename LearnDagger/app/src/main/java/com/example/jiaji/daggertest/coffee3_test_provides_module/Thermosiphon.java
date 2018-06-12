package com.example.jiaji.daggertest.coffee3_test_provides_module;


import javax.inject.Inject;

/**
 * 热虹吸
 */
public class Thermosiphon implements Pump
{
    private Heater heater;

    @Inject
    public Thermosiphon(Heater heater) {
        System.out.println("Thermosiphon() heater = " + heater);
        this.heater = heater;
    }

    @Override
    public void pump() {
        if (heater.isHot()) {
            System.out.println("=>=> 抽水 =>=>");
        }
    }
}
