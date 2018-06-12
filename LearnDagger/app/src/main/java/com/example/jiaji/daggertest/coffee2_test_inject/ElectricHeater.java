package com.example.jiaji.daggertest.coffee2_test_inject;

import javax.inject.Inject;

/**
 * 电子加热器
 */
public class ElectricHeater implements Heater {
    @Inject
    public ElectricHeater() { }

    boolean heating;
    @Override
    public void on() {
        System.out.println("~~~~heating~~~~");
        this.heating = true;
    }
    @Override
    public void off() {
        this.heating = false;
    }
    @Override
    public boolean isHot() {
        return heating;
    }
}
