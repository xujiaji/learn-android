package com.example.jiaji.daggertest.coffee8_test_optional_binding;

import java.util.Optional;

import javax.inject.Inject;

/**
 * author: xujiaji
 * created on: 2018/5/8 20:29
 * description:
 */
public class Cup
{
    @Inject
    Optional<Coffee> coffee;

    @Inject
    public Cup()
    {

    }

    public static void main(String[] args)
    {
        Cup cup = DaggerCComponent.create().getCup();
        System.out.println(cup.coffee);
        if (cup.coffee.isPresent())
        {
            System.out.println("有咖啡");
        } else
        {
            System.out.println("无咖啡");
        }
    }
}
