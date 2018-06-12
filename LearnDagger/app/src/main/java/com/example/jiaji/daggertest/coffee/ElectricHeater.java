package com.example.jiaji.daggertest.coffee;

/**
 * 电子加热器
 */

public class ElectricHeater implements Heater {

    public ElectricHeater()
    {
        System.out.println("ElectricHeater()");
    }

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
