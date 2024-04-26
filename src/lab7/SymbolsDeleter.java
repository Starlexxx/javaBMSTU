package lab7;

public class SymbolsDeleter {
    public static void main(String[] args) {
        SymbolsDeleter sd = new SymbolsDeleter();
        System.out.println(sd.deleteNonLetterSymbols("Hello, world!"));
    }
    public String deleteNonLetterSymbols(String text) {
        String result = text.replaceAll("[^a-zA-Z\\s]", "");
        result = result.replaceAll("\\s+", " ");
        return result;
    }
}