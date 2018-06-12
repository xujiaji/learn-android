package com.example.jiaji.daggertest.coffee9_test_bindsinstance;

import dagger.BindsInstance;
import dagger.Component;

/**
 * author: xujiaji
 * created on: 2018/5/8 21:43
 * description:
 */
@Component
public interface UComponent
{
    User getUser();

    @Component.Builder
    interface Builder
    {
        @BindsInstance Builder name(@Name String name);
        @BindsInstance Builder love(@Love String love);
        UComponent build();
    }
}
