package lab3.shop;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private final List<Order> orders;

    public Customer() {
        this.orders = new ArrayList<>();
    }

    public void createOrder(Product product) {
        Order newOrder = new Order();
        newOrder.addProduct(product);
        this.orders.add(newOrder);
    }

    public void payOrder(Order order) {
        if (this.orders.contains(order)) {
            order.setPaid(true);
        } else {
            System.out.println("Order not found.");
        }
    }
}
