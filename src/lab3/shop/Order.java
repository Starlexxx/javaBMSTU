package lab3.shop;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private final List<Product> products;
    private boolean isPaid;

    public Order() {
        this.products = new ArrayList<>();
        this.isPaid = false;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void addProduct(Product product) {
        this.products.add(product);
        System.out.println("Product added to order: " + product.getName());
    }

    public boolean isPaid() {
        return isPaid;
    }

    public void setPaid(boolean isPaid) {
        this.isPaid = isPaid;
    }
}
