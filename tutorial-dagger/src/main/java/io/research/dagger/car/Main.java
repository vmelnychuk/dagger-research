package io.research.dagger.car;

import io.research.dagger.car.DaggerVehiclesComponent;

public class Main {
    public static void main(String[] args) {
        VehiclesComponent component = DaggerVehiclesComponent.create();
        Car car1 = component.buildCar();
        Car car2 = component.buildCar();
        if (car1.getBrand() != car2.getBrand()) {
            throw new RuntimeException("brands are different");
        }

    }
}
