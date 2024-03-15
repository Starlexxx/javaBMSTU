package lab3.shop;

import java.util.ArrayList;
import java.util.List;

public class Administrator {
    private final List<Customer> blackList;
    private final List<Product> products;
    private final List<Sale> sales;

    public Administrator() {
        this.blackList = new ArrayList<>();
        this.products = new ArrayList<>();
        this.sales = new ArrayList<>();
    }

    public void addProduct(Product product) {
        this.products.add(product);
        System.out.println("Admin: product added: " + product.getName());
    }

    public void registerSale(Sale sale) {
        this.sales.add(sale);
        System.out.println("Sale registered for customer: " + sale.getCustomer());
    }

    public void addToBlackList(Customer customer) {
        this.blackList.add(customer);
        System.out.println("Customer added to black list: " + customer);
    }
}
