package com.example.jiaji.daggertest.coffee;

import javax.inject.Named;

import dagger.BindsInstance;
import dagger.Component;

@Component(modules = {AppModule.class})
public interface AppComponent
{
    App app();

    @Named("UserName")
    BindingInstancesEntity boeUserName();

    @Named("Password")
    BindingInstancesEntity boePassword();

    @Component.Builder
    interface Builder
    {
        @BindsInstance Builder userName(@UserName String str);
        @BindsInstance Builder password(@Password String pwd);
        AppComponent build();
    }
}
