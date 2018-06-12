package com.example.jiaji.daggertest.coffee7_test_named_qualifier;

import dagger.Component;

/**
 * author: xujiaji
 * created on: 2018/5/8 19:49
 * description:
 */
@Component(modules = RobotModule.class)
public interface RobotComponent
{
    Robot getRobot();
}
