package lab2;

import java.util.Date;
import java.util.Scanner;
import java.time.LocalDate;

public class IntervalDetector {
    static final LocalDate receivedDate = LocalDate.of(2024, 2, 9);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of k:");
        double k = scanner.nextDouble();

        int interval;
        if (k <= 0) {
            interval = 1;
        } else if (k <= 5) {
            interval = 2;
        } else if (k <= 10) {
            interval = 3;
        } else {
            interval = 4;
        }

        switch (interval) {
            case 1:
                System.out.println("The value of k belongs to the interval (-10k, 0]");
                break;
            case 2:
                System.out.println("The value of k belongs to the interval (0, 5]");
                break;
            case 3:
                System.out.println("The value of k belongs to the interval (5, 10]");
                break;
            case 4:
                System.out.println("The value of k belongs to the interval (10, 10k]");
                break;
        }

        System.out.println("Developer: Pavlovsky");
        System.out.println("Task received at: " + receivedDate);
        System.out.println("Task submitted at: " + new Date());
    }
}
