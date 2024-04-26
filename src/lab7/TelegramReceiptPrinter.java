package lab7;

public class TelegramReceiptPrinter {
    public static void main(String[] args) {
        TelegramReceiptPrinter printer = new TelegramReceiptPrinter();
        String telegramText = "Hello, my name is Andrew. I am a student.";
        double wordCost = 0.5;
        printer.printReceipt(telegramText, wordCost);
    }

    public void printReceipt(String telegramText, double wordCost) {
        String[] words = telegramText.split("\\s+");
        double totalCost = words.length * wordCost;
        System.out.println("Receipt for telegram:");
        System.out.println("Words count: " + words.length);
        System.out.println("Cost per word: " + wordCost);
        System.out.println("Total cost: " + totalCost);
    }
}
