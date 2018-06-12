package com.example.jiaji.daggertest.coffee9_test_bindsinstance;

import java.lang.annotation.Retention;

import javax.inject.Qualifier;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * author: xujiaji
 * created on: 2018/5/8 21:44
 * description:
 */
@Qualifier
@Retention(RUNTIME)
public @interface Name { }
