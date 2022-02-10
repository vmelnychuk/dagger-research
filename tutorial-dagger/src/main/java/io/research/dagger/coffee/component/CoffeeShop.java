package io.research.dagger.coffee.component;

import dagger.Component;
import io.research.dagger.coffee.domain.CoffeeMaker;
import io.research.dagger.coffee.module.HeaterModule;
import io.research.dagger.coffee.module.PumpModule;

import javax.inject.Singleton;

@Singleton
@Component(modules = {HeaterModule.class, PumpModule.class})
public interface CoffeeShop {
    CoffeeMaker maker();
}
