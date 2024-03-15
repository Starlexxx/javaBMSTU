package lab3.shop;

public class Main {
    public static void main(String[] args) {
        Administrator admin = new Administrator();
        Customer customer = new Customer();
        Product product = new Product("Laptop", 1000);
        Order order = new Order();
        order.addProduct(product);
        Sale sale = new Sale(order, customer);
        admin.addProduct(product);
        admin.registerSale(sale);
        admin.addToBlackList(customer);
    }
}
