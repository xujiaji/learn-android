package com.example.jiaji.daggertest.coffee;

import javax.inject.Inject;

/**
 * 热虹吸
 */
public class Thermosiphon implements Pump {

    private final Heater heater;

    @Inject
    Thermosiphon(Heater heater)
    {
        System.out.println("Thermosiphon(Heater heater) - heater = " + heater);
        this.heater = heater;
    }

    @Override
    public void pump() {
        if (heater.isHot())
        {
            System.out.println("=>=> 抽水 =>=>");
        }
    }
}
