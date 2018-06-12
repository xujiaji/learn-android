package com.example.jiaji.daggertest.coffee10_test_subcomponent_dependencies;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;

import javax.inject.Scope;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * author: xujiaji
 * created on: 2018/5/8 15:50
 * description:
 */

@Scope
@Documented
@Retention(RUNTIME)
public @interface MySingle { }
