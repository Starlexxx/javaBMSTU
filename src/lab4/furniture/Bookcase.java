package lab4.furniture;

public class Bookcase extends Cupboard {
    private int bookCapacity;

    public Bookcase(int shelves, int bookCapacity) {
        super(shelves);
        this.bookCapacity = bookCapacity;
    }

    public int getBookCapacity() {
        return bookCapacity;
    }

    public void setBookCapacity(int bookCapacity) {
        this.bookCapacity = bookCapacity;
    }

    @Override
    public void assemble() {
        System.out.println("The bookcase is being assembled.");
    }

    @Override
    public void disassemble() {
        System.out.println("The bookcase is being disassembled.");
    }
}
