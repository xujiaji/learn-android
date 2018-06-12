package com.example.jiaji.daggertest.coffee7_test_named_qualifier;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * author: xujiaji
 * created on: 2018/5/8 19:48
 * description:
 */
public class Robot
{
    @Left
    @Inject
    Hand leftHand;

    @Right
    @Inject
    Hand rightHand;

    @Inject
    public Robot()
    {

    }

    public static void main(String[] args)
    {
        Robot robot = DaggerRobotComponent.create().getRobot();
        System.out.println(robot.leftHand);
        System.out.println(robot.rightHand);
    }
}
