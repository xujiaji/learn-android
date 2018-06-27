package com.example.jiaji.daggertest.coffee6_test_lazy_provider;

import javax.inject.Inject;
import javax.inject.Provider;

import dagger.Lazy;

/**
 * author: xujiaji
 * created on: 2018/5/8 16:34
 * description:
 */
public class Main
{
//    @Inject
//    Lazy<LazyEntity> entityLazy;

    @Inject
    Provider<LazyEntity> entityLazy;

    @Inject
    public Main()
    {
    }

    public static void main(String[] args)
    {
        Main main = DaggerMyComponent.builder()
                .build()
                .getMain();
        System.out.println("此时LazyEntity还没有实例化");
        for (int i = 0; i < 3; i++)
        {
            System.out.println(main.entityLazy.get().hashCode());
        }

    }

}
