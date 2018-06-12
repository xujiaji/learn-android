package com.example.jiaji.daggertest.coffee7_test_named_qualifier;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

/**
 * author: xujiaji
 * created on: 2018/5/8 19:49
 * description:
 */
@Module
public class RobotModule
{
    @Left
    @Provides
    static Hand provideLeftHand()
    {
        return new Hand("left hand");
    }

    @Right
    @Provides
    static Hand provideRightHand()
    {
        return new Hand("right hand");
    }
}
