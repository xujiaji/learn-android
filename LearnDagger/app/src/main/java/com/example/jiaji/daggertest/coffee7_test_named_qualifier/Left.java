package com.example.jiaji.daggertest.coffee7_test_named_qualifier;

import java.lang.annotation.Retention;

import javax.inject.Qualifier;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * author: xujiaji
 * created on: 2018/5/8 20:15
 * description:
 */
@Qualifier
@Retention(RUNTIME)
public @interface Left { }
