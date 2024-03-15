package lab4.park;

import java.util.ArrayList;
import java.util.List;

public class Park {
    private final List<Attraction> attractions;

    public Park() {
        this.attractions = new ArrayList<>();
    }

    public List<Attraction> getAttractions() {
        return attractions;
    }

    public void addAttraction(Attraction attraction) {
        this.attractions.add(attraction);
    }

    public static class Attraction {
        private String name;
        private String workingHours;
        private double price;

        public Attraction(String name, String workingHours, double price) {
            this.name = name;
            this.workingHours = workingHours;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getWorkingHours() {
            return workingHours;
        }

        public void setWorkingHours(String workingHours) {
            this.workingHours = workingHours;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        @Override
        public String toString() {
            return "Attraction{" +
                    "name='" + name + '\'' +
                    ", workingHours='" + workingHours + '\'' +
                    ", price=" + price +
                    '}';
        }
    }
}
