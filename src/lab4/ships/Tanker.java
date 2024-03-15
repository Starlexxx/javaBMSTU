package lab4.ships;

public class Tanker extends CargoShip {
    private int liquidCapacity;

    public Tanker(int cargoCapacity, int liquidCapacity) {
        super(cargoCapacity);
        this.liquidCapacity = liquidCapacity;
    }

    public int getLiquidCapacity() {
        return liquidCapacity;
    }

    public void setLiquidCapacity(int liquidCapacity) {
        this.liquidCapacity = liquidCapacity;
    }

    @Override
    public void sail() {
        System.out.println("The tanker is sailing.");
    }

    @Override
    public void dock() {
        System.out.println("The tanker is docking.");
    }
}
