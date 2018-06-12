package com.example.jiaji.daggertest.coffee;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule
{

    @Named("UserName")
    @Provides
    BindingInstancesEntity providesBIEUser(@UserName String str)
    {
        return new BindingInstancesEntity(str);
    }

    @Named("Password")
    @Provides
    BindingInstancesEntity providesBIEPwd(@Password String str)
    {
        return new BindingInstancesEntity(str);
    }
}
