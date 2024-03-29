package lab5;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class CarArray {
    private final Car[] cars;

    public static void main(String[] args) {
        CarArray carArray = getCarArray();
        List<Car> bmwCars = carArray.getCarsByBrand("BMW");
        System.out.println("BMW cars:");
        for (Car car : bmwCars) {
            System.out.println(car);
        }

        List<Car> oldAudiCars = carArray.getCarsByModelAndYears("A6", 3);
        System.out.println("Old Audi cars:");
        for (Car car : oldAudiCars) {
            System.out.println(car);
        }

        List<Car> expensiveCars = carArray.getCarsByYearAndPrice(2019, 50000);
        System.out.println("Expensive cars:");
        for (Car car : expensiveCars) {
            System.out.println(car);
        }
    }

    @NotNull
    private static CarArray getCarArray() {
        Car[] cars = new Car[]{
                new Car(1, "BMW", "X5", 2015, "Black", 30000, "AA123B"),
                new Car(2, "Audi", "A6", 2016, "White", 35000, "AA432B"),
                new Car(3, "BMW", "X5", 2017, "Black", 40000, "AA123B"),
                new Car(4, "Audi", "A6", 2018, "White", 45000, "AA432B"),
                new Car(5, "BMW", "X5", 2019, "Black", 50000, "AA123B"),
                new Car(6, "Audi", "A6", 2020, "White", 55000, "AA432B")
        };

        return new CarArray(cars);
    }

    public CarArray(Car[] cars) {
        this.cars = cars;
    }

    public List<Car> getCarsByBrand(String brand) {
        List<Car> result = new ArrayList<>();
        for (Car car : cars) {
            if (car.getBrand().equals(brand)) {
                result.add(car);
            }
        }
        return result;
    }

    public List<Car> getCarsByModelAndYears(String model, int years) {
        List<Car> result = new ArrayList<>();
        int currentYear = java.util.Calendar.getInstance().get(java.util.Calendar.YEAR);
        for (Car car : cars) {
            if (car.getModel().equals(model) && (currentYear - car.getYear()) > years) {
                result.add(car);
            }
        }
        return result;
    }

    public List<Car> getCarsByYearAndPrice(int year, double price) {
        List<Car> result = new ArrayList<>();
        for (Car car : cars) {
            if (car.getYear() == year && car.getPrice() > price) {
                result.add(car);
            }
        }
        return result;
    }
}
