package com.example.jiaji.daggertest.coffee;

import javax.inject.Inject;

public class QualifierEntity
{
    private String str;
    @Inject
    public QualifierEntity()
    {
        str = "test QualifierEntity()";
    }
    public QualifierEntity(String str)
    {
        this.str = str;
    }

    @Override
    public String toString()
    {
        return str + "," + hashCode();
    }
}
