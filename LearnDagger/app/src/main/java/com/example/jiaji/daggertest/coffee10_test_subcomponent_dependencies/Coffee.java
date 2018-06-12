package com.example.jiaji.daggertest.coffee10_test_subcomponent_dependencies;

/**
 * author: xujiaji
 * created on: 2018/5/9 10:24
 * description:
 */
public class Coffee
{
    private Water water;
    public Coffee(Water water)
    {
        this.water = water;
    }

    @Override
    public String toString()
    {
        return "coffee:" + hashCode() + "; water:" + water.hashCode();
    }
}
