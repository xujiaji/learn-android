package com.example.jiaji.daggertest.coffee;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import dagger.Reusable;

@Module(includes = PumpModule.class)
public class DripCoffeeModule {

    public DripCoffeeModule(String str)
    {

    }

    @Reusable
    @Provides
    Heater provideheater()
    {
        System.out.println("provideheater()");
        return new ElectricHeater();
    }

//    @Provides
//    Pump providePump(Thermosiphon pump)
//    {
//        System.out.println("providePump");
//        return pump;
//    }

    @Named("one")
    @Provides
    QualifierEntity provideQualifierEntity1()
    {
        return new QualifierEntity("QualifierEntity1");
    }

    @Named("two")
    @Provides
    QualifierEntity provideQualifierEntity2()
    {
        return new QualifierEntity("QualifierEntity2");
    }

//    @Provides
//    static BindsOptionalEntity providesOptionalEntity()
//    {
//        return new BindsOptionalEntity();
//    }
}
