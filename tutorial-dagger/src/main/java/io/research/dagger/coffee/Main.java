package io.research.dagger.coffee;

import io.research.dagger.coffee.component.CoffeeShop;
import io.research.dagger.coffee.component.DaggerCoffeeShop;
import io.research.dagger.coffee.domain.CoffeeMaker;

public class Main {
    public static void main(String[] args) {
        CoffeeShop coffeeShop = DaggerCoffeeShop.create();
        CoffeeMaker maker = coffeeShop.maker();
        maker.brew();
    }
}
