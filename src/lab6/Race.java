package lab6;

import java.util.Arrays;
import java.util.Stack;

public class Race {
    public static void main(String[] args) {
        Car[] cars = {
                new Car(1, 2),
                new Car(2, 1),
                new Car(3, 3),
                new Car(4, 2),
                new Car(5, 4),
                new Car(6, 3),
                new Car(7, 5),
                new Car(8, 4),
                new Car(9, 6),
                new Car(10, 5),
        };

        System.out.println("There were " + overtakes(cars) + " overtakes.");
    }

    public static int overtakes(Car[] cars) {
        Arrays.sort(cars, (a, b) -> b.position - a.position);
        Stack<Car> stack = new Stack<>();
        for (Car car : cars) {
            while (!stack.isEmpty() && stack.peek().speed <= car.speed) {
                stack.pop();
            }
            stack.push(car);
        }
        return cars.length - stack.size();
    }
}