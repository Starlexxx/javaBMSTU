package lab3.carbase;

import java.util.ArrayList;
import java.util.List;

public class Dispatcher {
    private final List<Driver> drivers;

    public Dispatcher() {
        this.drivers = new ArrayList<>();
        List<Car> cars = new ArrayList<>();
    }

    public void assignTrip(Driver driver, Trip trip) {
        driver.setAssignedTrip(trip);
        System.out.println("Assigned trip to driver");
    }

    public void assignCar(Driver driver, Car car) {
        driver.setAssignedCar(car);
        System.out.println("Assigned car to driver");
    }

    public void suspendDriver(Driver driver) {
        drivers.remove(driver);
        System.out.println("Driver suspended");
    }
}
