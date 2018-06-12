package com.example.jiaji.daggertest.coffee4_test_component;


import javax.inject.Inject;

public class MNActivity
{
    @Inject
    MNPresenter presenter;
    public void onCreate()
    {
        System.out.println("MNActivity hashCode = " + hashCode());
        DaggerTestComponent
                .builder()
                .mNModule(new MNModule(this))
                .build()
                .inject(this);
        System.out.println(presenter);
    }
}
