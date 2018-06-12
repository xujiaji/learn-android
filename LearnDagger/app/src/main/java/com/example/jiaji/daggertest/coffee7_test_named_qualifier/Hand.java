package com.example.jiaji.daggertest.coffee7_test_named_qualifier;
/**
 * author: xujiaji
 * created on: 2018/5/8 19:48
 * description:
 */
public class Hand
{
    private String desc;
    public Hand(String desc)
    {
        this.desc = desc;
    }

    @Override
    public String toString()
    {
        return desc;
    }
}
