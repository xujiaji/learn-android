package com.example.jiaji.daggertest.coffee;

import dagger.Binds;
import dagger.BindsOptionalOf;
import dagger.Module;
import dagger.Provides;

@Module
public abstract class PumpModule
{
    @Binds
    abstract Pump bindPump(Thermosiphon pump);


}
