package lab4.ships;

public class Main {
    public static void main(String[] args) {
        CargoShip cargoShip = new CargoShip(100);
        Tanker tanker = new Tanker(200, 300);

        cargoShip.sail();
        cargoShip.dock();
        System.out.println("Cargo ship cargo capacity: " + cargoShip.getCargoCapacity());

        tanker.sail();
        tanker.dock();
        System.out.println("Tanker cargo capacity: " + tanker.getCargoCapacity());
        System.out.println("Tanker liquid capacity: " + tanker.getLiquidCapacity());
    }
}
