package com.example.jiaji.daggertest.coffee5_test_scope;

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
public @interface MySingle
{
}
