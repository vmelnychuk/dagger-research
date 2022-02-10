package io.research.dagger.coffee.domain.impl;

import io.research.dagger.coffee.domain.Heater;

public class ElectricHeater implements Heater {
    private boolean heating;

    @Override
    public void on() {
        this.heating = true;
        System.out.println("heating...");
    }

    @Override
    public void off() {
        this.heating = false;
        System.out.println("turn off heating.");
    }

    @Override
    public boolean isHot() {
        return this.heating;
    }
}
