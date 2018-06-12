package com.example.jiaji.daggertest.coffee4_test_component;


import javax.inject.Inject;

public class MNPresenter
{
    MNActivity mnActivity;
    @Inject
    MNPresenter(MNActivity mnActivity)
    {
        this.mnActivity = mnActivity;
        System.out.println("MNPresenter mnActivity = " + mnActivity.hashCode());
    }
}
