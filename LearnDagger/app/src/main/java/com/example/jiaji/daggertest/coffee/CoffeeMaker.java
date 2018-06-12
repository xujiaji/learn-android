package com.example.jiaji.daggertest.coffee;

import android.support.annotation.Nullable;

import java.util.Optional;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Provider;

import dagger.Lazy;

/**
 * 咖啡机
 */
public class CoffeeMaker {

    @Inject
    Heater heater;//当我们要使用它时才创建一个加热器

    @Inject
    Pump pump;//汞

    @Inject
    Lazy<LazyEntity> entityLazy;

    @Inject
    Provider<ProviderEntity> entityProvider;

    @Named("one")
    @Inject
    QualifierEntity qualifierEntity1;

    @Named("one")
    @Inject
    QualifierEntity qualifierEntity1_1;

    @Named("two")
    @Inject
    QualifierEntity qualifierEntity2;

    @Inject
    Optional<BindsOptionalEntity> bindsOptionalEntity;

    @Inject
    CoffeeMaker()
    {
    }

    public void brew()
    {
        System.out.println("public void brew()");
        System.out.println("bindsOptionalEntity = " + bindsOptionalEntity);
        if (bindsOptionalEntity.isPresent())
        {
            System.out.println("bindsOptionalEntity = " + bindsOptionalEntity.get());
        }
        System.out.println("CoffeeMaker - qualifierEntity1 = " + qualifierEntity1);
        System.out.println("CoffeeMaker - qualifierEntity1_1 = " + qualifierEntity1_1);
//        System.out.println("CoffeeMaker - qualifierEntity2 = " + qualifierEntity2);

//        for (int i = 0; i < 5; i++)
//        {
//            System.out.println("CoffeeMaker - entityProvider = " + entityProvider.get());
//        }
//        System.out.println("CoffeeMaker - entityLazy = " + entityLazy.get());
        System.out.println("CoffeeMaker - heater = " + heater);
        System.out.println("CoffeeMaker - pump = " + pump);
        heater.on();
        pump.pump();
        System.out.println("[_]P coffee! [_]P");
        heater.off();
    }
}
