package lab1;

import java.util.Arrays;

public class SortedNumbersPrinter {
    public static void main(String[] args) {
        int[] numbers = PrimeNumbersPrinter.numbersInput();

        Arrays.sort(numbers);

        System.out.println("Числа в порядке возрастания:");
        for (int number : numbers) {
            System.out.println(number);
        }

        System.out.println("Числа в порядке убывания:");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }
    }
}
