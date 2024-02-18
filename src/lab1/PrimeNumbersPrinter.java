package lab1;

import java.util.Scanner;

public class PrimeNumbersPrinter {
    public static void main(String[] args) {
        int[] numbers = numbersInput();

        System.out.println("Простые числа:");
        for (int number : numbers) {
            if (isPrime(number)) {
                System.out.println(number);
            }
        }
    }

    static int[] numbersInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество чисел:");
        int n = scanner.nextInt();
        int[] numbers = new int[n];

        System.out.println("Введите числа:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        return numbers;
    }

    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
