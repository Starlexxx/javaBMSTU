package lab7;

public class WordTransformer {
    public static void main(String[] args) {
        WordTransformer transformer = new WordTransformer();
        String text = "banana apple racecar";
        System.out.println(transformer.transformWords(text));
    }

    public String transformWords(String text) {
        String[] words = text.split("\\s+");
        for (int i = 0; i < words.length; i++) {
            char firstLetter = words[i].charAt(0);
            char lastLetter = words[i].charAt(words[i].length() - 1);
            words[i] = words[i].replaceAll("(?i)(?<=.)" + firstLetter, "")
                               .replaceAll("(?i)" + lastLetter + "(?=.)", "");
        }
        return String.join(" ", words);
    }
}