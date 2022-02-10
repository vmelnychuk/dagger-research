package io.research.dagger.coffee.domain.impl;

import io.research.dagger.coffee.domain.Heater;
import io.research.dagger.coffee.domain.Pump;

import javax.inject.Inject;

public class Thermosiphon implements Pump {
    private final Heater heater;

    @Inject
    public Thermosiphon(Heater heater) {
        this.heater = heater;
    }

    @Override
    public void pump() {
        if (heater.isHot()) {
            System.out.println("pumping...");
        }
    }
}
