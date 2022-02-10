package io.research.dagger.coffee.module;

import dagger.Module;
import dagger.Provides;
import io.research.dagger.coffee.domain.Heater;
import io.research.dagger.coffee.domain.impl.ElectricHeater;

import javax.inject.Singleton;

@Module
public class HeaterModule {
    @Provides
    @Singleton
    public Heater provideHeater() {
        return new ElectricHeater();
    }
}
