package com.example.jiaji.daggertest.coffee9_test_bindsinstance;

/**
 * author: xujiaji
 * created on: 2018/5/8 21:45
 * description:
 */
public class Main
{
    public static void main(String[] args)
    {
        UComponent uComponent = DaggerUComponent.builder()
                .name("奏响曲")
                .love("beautiful girl")
                .build();
        System.out.println(uComponent.getUser());
    }
}
