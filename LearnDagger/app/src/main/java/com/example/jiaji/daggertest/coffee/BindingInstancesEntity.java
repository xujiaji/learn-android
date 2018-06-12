package com.example.jiaji.daggertest.coffee;

public class BindingInstancesEntity
{
    String str;
    public BindingInstancesEntity(String str)
    {
        this.str = str;
    }

    @Override
    public String toString()
    {
        return str + ":" + hashCode();
    }
}
