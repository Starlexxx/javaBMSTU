package lab7;

public class WordCounter {
    public static void main(String[] args) {
        WordCounter counter = new WordCounter();
        String text = "Hello, my name is Andrew. I am a student. Hello, world!";
        String word = "Hello";
        System.out.println(counter.countWordOccurrences(text, word));
    }

    public int countWordOccurrences(String text, String word) {
        String[] words = text.toLowerCase().replaceAll("[^a-z\\s]", "").split("\\s+");
        int count = 0;
        for (String w : words) {
            if (w.equalsIgnoreCase(word)) {
                count++;
            }
        }
        return count;
    }
}