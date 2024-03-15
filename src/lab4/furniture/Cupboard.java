package lab4.furniture;

public abstract class Cupboard implements Furniture {
    protected int shelves;

    public Cupboard(int shelves) {
        this.shelves = shelves;
    }

    public int getShelves() {
        return shelves;
    }

    public void setShelves(int shelves) {
        this.shelves = shelves;
    }

    @Override
    public void assemble() {
        System.out.println("The cupboard is being assembled.");
    }

    @Override
    public void disassemble() {
        System.out.println("The cupboard is being disassembled.");
    }
}
