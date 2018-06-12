package com.example.jiaji.daggertest.coffee5_test_scope;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import dagger.Reusable;


@Module
public class DripCoffeeModule {
    @Reusable
    @Provides
    Heater provideheater() {
        System.out.println("provideheater()");
        return new ElectricHeater();
    }
    @Provides
    Pump providePump(Thermosiphon pump) {
        System.out.println("providePump");
        return pump;
    }
}
