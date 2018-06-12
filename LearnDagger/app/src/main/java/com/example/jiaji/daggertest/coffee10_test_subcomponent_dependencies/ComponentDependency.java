package com.example.jiaji.daggertest.coffee10_test_subcomponent_dependencies;

import javax.inject.Singleton;

import dagger.Component;

/**
 * author: xujiaji
 * created on: 2018/5/9 10:28
 * description:
 */
//public class ComponentDependency
//{
//
//    @Component(modules = WModule.class)
//    public interface WComponent
//    {
//        Water water();
//    }
//
//    @Component(modules = CModule.class, dependencies = WComponent.class)
//    public interface CComponent
//    {
//        Coffee coffee();
//    }
//
//    public static void main(String[] args)
//    {
//        WComponent wComponent = DaggerComponentDependency_WComponent
//                .create();
//        System.out.println("water:" + wComponent.water().hashCode());
//
//        CComponent cComponent = DaggerComponentDependency_CComponent
//                .builder()
//                .wComponent(wComponent)
//                .build();
//
//        System.out.println(cComponent.coffee());
//    }
//}
