package lab4.park;

public class Main {
    public static void main(String[] args) {
        Park park = new Park();
        park.addAttraction(new Park.Attraction("Roller coaster", "10:00 - 20:00", 10.0));
        park.addAttraction(new Park.Attraction("Ferris wheel", "10:00 - 20:00", 5.0));
        park.addAttraction(new Park.Attraction("Bumper cars", "10:00 - 20:00", 3.0));

        for (Park.Attraction attraction : park.getAttractions()) {
            System.out.println(attraction);
        }
    }
}
