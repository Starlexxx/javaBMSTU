package lab3.shop;

public class Sale {
    private Order order;
    private Customer customer;

    public Sale(Order order, Customer customer) {
        this.order = order;
        this.customer = customer;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
