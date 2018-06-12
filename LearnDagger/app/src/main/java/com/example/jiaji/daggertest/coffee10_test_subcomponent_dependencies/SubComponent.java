package com.example.jiaji.daggertest.coffee10_test_subcomponent_dependencies;

import dagger.Component;
import dagger.Subcomponent;

/**
 * author: xujiaji
 * created on: 2018/5/9 10:34
 * description:
 */
public class SubComponent
{
    @Component(modules = WModule.class)
    public interface WComponent
    {
        CComponent cComponent(CModule cModule);
    }
    @Subcomponent(modules = CModule.class)
    public interface CComponent
    {
        Coffee coffee();
    }

    public static void main(String[] args)
    {
        WComponent wComponent = DaggerSubComponent_WComponent
                .create();

        CComponent cComponent = wComponent
                .cComponent(new CModule());

        System.out.println(cComponent.coffee());
    }
}
