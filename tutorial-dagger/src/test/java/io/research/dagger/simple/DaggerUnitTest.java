package io.research.dagger.simple;

import io.research.dagger.car.Car;
import io.research.dagger.car.DaggerVehiclesComponent;
import io.research.dagger.car.VehiclesComponent;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class DaggerUnitTest {
    @Test
    public void testCreation() {
        VehiclesComponent component = DaggerVehiclesComponent.create();
        Car car1 = component.buildCar();
        Car car2 = component.buildCar();

        assertNotNull(car1);
        assertNotNull(car2);
        assertNotNull(car1.getEngine());
        assertNotNull(car2.getEngine());
        assertNotNull(car1.getBrand());
        assertNotNull(car2.getBrand());
        assertNotEquals(car1.getEngine(), car2.getEngine());
        assertEquals(car1.getBrand(), car2.getBrand());
    }
}
