package lab5;

import java.io.FileWriter;
import java.io.IOException;

public class Product {
    private final int id;
    private String name;
    private String upc;
    private String manufacturer;
    private double price;
    private int shelfLife;
    private int quantity;

    public Product(int id, String name, String upc, String manufacturer, double price, int shelfLife, int quantity) {
        this.id = id;
        this.name = name;
        this.upc = upc;
        this.manufacturer = manufacturer;
        this.price = price;
        this.shelfLife = shelfLife;
        this.quantity = quantity;
    }

    public void setName(String name) throws InvalidProductException {
        if (name == null || name.isEmpty()) {
            throw new InvalidProductException("Name cannot be null or empty");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setUpc(String upc) throws InvalidProductException {
        if (upc == null || upc.isEmpty()) {
            throw new InvalidProductException("UPC cannot be null or empty");
        }
        this.upc = upc;
    }

    public String getUpc() {
        return upc;
    }

    public void setManufacturer(String manufacturer) throws InvalidProductException {
        if (manufacturer == null || manufacturer.isEmpty()) {
            throw new InvalidProductException("Manufacturer cannot be null or empty");
        }
        this.manufacturer = manufacturer;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setPrice(double price) throws InvalidProductException {
        if (price < 0) {
            throw new InvalidProductException("Price cannot be negative");
        }
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setShelfLife(int shelfLife) throws InvalidProductException {
        if (shelfLife < 0) {
            throw new InvalidProductException("Shelf life cannot be negative");
        }
        this.shelfLife = shelfLife;
    }

    public int getShelfLife() {
        return shelfLife;
    }

    public void setQuantity(int quantity) throws InvalidProductException {
        if (quantity < 0) {
            throw new InvalidProductException("Quantity cannot be negative");
        }
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void saveProductDetailsToFile(String filename) throws IOException {
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write(this.toString());
        }
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", upc='" + upc + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", price=" + price +
                ", shelfLife=" + shelfLife +
                ", quantity=" + quantity +
                '}';
    }
}
