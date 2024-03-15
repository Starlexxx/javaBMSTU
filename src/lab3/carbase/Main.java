package lab3.carbase;

public class Main {
    public static void main(String[] args) {
        Dispatcher dispatcher = new Dispatcher();
        Driver driver = new Driver();
        Car car = new Car();
        Trip trip = new Trip();

        dispatcher.assignTrip(driver, trip);
        dispatcher.assignCar(driver, car);
        dispatcher.suspendDriver(driver);
    }
}
