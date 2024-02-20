package lab2;

import java.util.ArrayList;
import java.util.Date;
import java.time.LocalDate;
import java.util.Scanner;

public class PalindromeSearcher {
    static final LocalDate receivedDate = LocalDate.of(2024, 2, 9);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of words:");
        int n = scanner.nextInt();
        ArrayList<String> words = new ArrayList<>();

        System.out.println("Enter the words:");
        for (int i = 0; i < n; i++) {
            words.add(scanner.next());
        }

        ArrayList<String> palindromeWords = new ArrayList<>();
        for (String word : words) {
            if (isNumericPalindrome(word)) {
                palindromeWords.add(word);
            }
        }

        if (palindromeWords.size() >= 2) {
            System.out.println("The second palindrome word is: " + palindromeWords.get(1));
        }

        System.out.println("Developer: Pavlovsky");
        System.out.println("Task received at: " + receivedDate);
        System.out.println("Task submitted at: " + new Date());
    }

    public static boolean isNumericPalindrome(String word) {
        if (word.matches("[0-9]+")) {
            int i = 0, j = word.length() - 1;
            while (i < j) {
                if (word.charAt(i) != word.charAt(j)) {
                    return false;
                }
                i++;
                j--;
            }
            return true;
        }
        return false;
    }
}
