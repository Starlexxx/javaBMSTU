package lab7;

public class WordsDeleter {
    public static void main(String[] args) {
        WordsDeleter wordsDeleter = new WordsDeleter();
        String text = "Hello, my name is Andrew. I am a student.";
        System.out.println(wordsDeleter.deleteWordsOfCertainLengthStartingWithConsonant(text, 4));
    }

    public String deleteWordsOfCertainLengthStartingWithConsonant(String text, int length) {
        return text.replaceAll("(?i)\\b[b-df-hj-np-tv-z]\\w{" + (length - 1) + "}\\b", "");
    }
}