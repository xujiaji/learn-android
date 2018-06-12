package com.example.jiaji.daggertest.coffee9_test_bindsinstance;

import javax.inject.Inject;

/**
 * author: xujiaji
 * created on: 2018/5/8 21:40
 * description:
 */
public class User
{
    private String name;
    private String love;

    @Inject
    public User(@Name String name, @Love String love)
    {
        this.name = name;
        this.love = love;
    }

    @Override
    public String toString()
    {
        return "User{" +
                "name='" + name + '\'' +
                ", love='" + love + '\'' +
                '}';
    }
}
