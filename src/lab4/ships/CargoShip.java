package lab4.ships;

public class CargoShip implements Ship {
    protected int cargoCapacity;

    public CargoShip(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    @Override
    public void sail() {
        System.out.println("The cargo ship is sailing.");
    }

    @Override
    public void dock() {
        System.out.println("The cargo ship is docking.");
    }
}
