package lab5;

import java.io.FileWriter;
import java.io.IOException;

public class Car {
    private final int id;
    private String brand;
    private String model;
    private int year;
    private String color;
    private double price;
    private String registrationNumber;

    public Car(int id, String brand, String model, int year, String color, double price, String registrationNumber) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
        this.registrationNumber = registrationNumber;
    }

    public void setBrand(String brand) throws InvalidCarException {
        if (brand == null || brand.isEmpty()) {
            throw new InvalidCarException("Brand cannot be null or empty");
        }
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setModel(String model) throws InvalidCarException {
        if (model == null || model.isEmpty()) {
            throw new InvalidCarException("Model cannot be null or empty");
        }
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setYear(int year) throws InvalidCarException {
        if (year < 1886 || year > 2024) {
            throw new InvalidCarException("Year must be between 1886 and 2024");
        }
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setColor(String color) throws InvalidCarException {
        if (color == null || color.isEmpty()) {
            throw new InvalidCarException("Color cannot be null or empty");
        }
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setPrice(double price) throws InvalidCarException {
        if (price < 0) {
            throw new InvalidCarException("Price cannot be negative");
        }
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setRegistrationNumber(String registrationNumber) throws InvalidCarException {
        if (registrationNumber == null || registrationNumber.isEmpty()) {
            throw new InvalidCarException("Registration number cannot be null or empty");
        }
        this.registrationNumber = registrationNumber;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void saveCarDetailsToFile(String filename) throws IOException {
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write(this.toString());
        }
    }

    @Override
    public String toString() {
        return "Car{" + "id=" + id + ", brand='" + brand + '\'' + ", model='" + model + '\'' + ", year=" + year + ", color='" + color + '\'' + ", price=" + price + ", registrationNumber='" + registrationNumber + '\'' + '}';
    }
}
