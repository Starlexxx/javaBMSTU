package lab3;

import java.util.ArrayList;
import java.util.List;

public class ProductArray {

    public static void main(String[] args) {
        ProductArray productArray = getProductArray();
        List<Product> milkProducts = productArray.getProductsByName("Milk");
        System.out.println("Milk products:");
        for (Product product : milkProducts) {
            System.out.println(product);
        }

        List<Product> cheapProducts = productArray.getProductsByNameAndPrice("Milk", 3);
        System.out.println("Cheap milk products:");
        for (Product product : cheapProducts) {
            System.out.println(product);
        }

        List<Product> freshProducts = productArray.getProductsByShelfLife(5);
        System.out.println("Fresh products:");
        for (Product product : freshProducts) {
            System.out.println(product);
        }
    }

    private static ProductArray getProductArray() {
        Product[] products = new Product[]{
                new Product(1, "Milk", "123456789", "Milk Factory", 2, 7, 100),
                new Product(2, "Bread", "123456789", "Bread Factory", 1, 3, 100),
                new Product(3, "Beaf", "123456789", "Beaf Factory", 10, 5, 100),
                new Product(5, "Beer", "123456789", "Beer Factory", 3, 30, 100),
        };

        return new ProductArray(products);
    }

    private final Product[] products;

    public ProductArray(Product[] products) {
        this.products = products;
    }

    public List<Product> getProductsByName(String name) {
        List<Product> result = new ArrayList<>();
        for (Product product : products) {
            if (product.getName().equals(name)) {
                result.add(product);
            }
        }
        return result;
    }

    public List<Product> getProductsByNameAndPrice(String name, double price) {
        List<Product> result = new ArrayList<>();
        for (Product product : products) {
            if (product.getName().equals(name) && product.getPrice() <= price) {
                result.add(product);
            }
        }
        return result;
    }

    public List<Product> getProductsByShelfLife(int shelfLife) {
        List<Product> result = new ArrayList<>();
        for (Product product : products) {
            if (product.getShelfLife() > shelfLife) {
                result.add(product);
            }
        }
        return result;
    }
}
