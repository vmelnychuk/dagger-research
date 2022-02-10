package io.research.dagger.coffee.module;

import dagger.Module;
import dagger.Provides;
import io.research.dagger.coffee.domain.Heater;
import io.research.dagger.coffee.domain.Pump;
import io.research.dagger.coffee.domain.impl.Thermosiphon;

@Module
public class PumpModule {
    @Provides
    public Pump providePump(Heater heater) {
        return new Thermosiphon(heater);
    }
}
