package com.example.jiaji.daggertest.coffee2_test_inject;

import dagger.Component;

@Component
public interface PumpComponent {
    Thermosiphon getPump();
}