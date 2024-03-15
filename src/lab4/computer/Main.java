package lab4.computer;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer(new Computer.Specifications("Windows 10", "Intel Core i7", "16GB"));
        System.out.println(computer.getSpecs());
    }
}
