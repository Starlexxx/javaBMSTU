package lab7;

import java.util.HashSet;
import java.util.Set;

public class CommonLettersFinder {
    public static void main(String[] args) {
        CommonLettersFinder finder = new CommonLettersFinder();
        String poem = "Петр Петрович пошел погулять. Поймал попугая, пошел продавать. Просил полтиник, получил подзатыльник.";
        System.out.println(finder.findCommonLetters(poem));
    }

    public Set<Character> findCommonLetters(String text) {
        String[] words = text.toLowerCase().split("\\s+");
        if (words.length == 0) {
            return new HashSet<>();
        }
        Set<Character> commonLetters = new HashSet<>();
        for (char c : words[0].toCharArray()) {
            commonLetters.add(c);
        }
        for (String word : words) {
            Set<Character> wordLetters = new HashSet<>();
            for (char c : word.toCharArray()) {
                wordLetters.add(c);
            }
            commonLetters.retainAll(wordLetters);
        }
        return commonLetters;
    }
}