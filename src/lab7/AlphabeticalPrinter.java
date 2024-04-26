package lab7;

import java.util.Arrays;

public class AlphabeticalPrinter {
    public static void main(String[] args) {
        AlphabeticalPrinter printer = new AlphabeticalPrinter();
        String text = "Петр Петрович пошел погулять. Поймал попугая, пошел продавать. Просил полтиник, получил подзатыльник.";
        printer.printWordsInAlphabeticalOrder(text);
    }

    public void printWordsInAlphabeticalOrder(String text) {
        String[] words = text.toLowerCase().replaceAll("[^а-яА-Я ]", "").split("\\s+");
        Arrays.sort(words);
        char currentFirstLetter = words[0].charAt(0);
        System.out.println(words[0]);
        for (int i = 1; i < words.length; i++) {
            if (words[i].charAt(0) != currentFirstLetter) {
                System.out.println();
                currentFirstLetter = words[i].charAt(0);
            }
            System.out.println(words[i]);
        }
    }
}