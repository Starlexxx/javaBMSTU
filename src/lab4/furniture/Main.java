package lab4.furniture;

public class Main {
    public static void main(String[] args) {
        Bookcase bookcase = new Bookcase(5, 100);
        
        bookcase.assemble();
        bookcase.disassemble();

        System.out.println("Bookcase shelves: " + bookcase.getShelves());
        System.out.println("Bookcase book capacity: " + bookcase.getBookCapacity());
    }
}
