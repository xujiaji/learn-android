package com.example.jiaji.daggertest.coffee3_test_provides_module;


import dagger.Module;
import dagger.Provides;

@Module
public class DripCoffeeModule
{
    private String str;

    public DripCoffeeModule(String str)
    {
        this.str = str;
    }

    @Provides
    Heater provideHeater()
    {
        System.out.println("provideHeater");
        return new ElectricHeater();
    }

    @Provides
    Pump providePump(Thermosiphon pump)
    {
        System.out.println("providePump");
        return pump;
    }

    @Provides
    String provideStr()
    {
        return str;
    }

    @Provides
    TestModuleAttr provideTestModuleAttr()
    {
        return new TestModuleAttr(str);
    }
}
