package lab7;

public class TextDecipher {
    public static void main(String[] args) {
        TextDecipher decipher = new TextDecipher();
        String encryptedText = "Пв,ире ритм!";
        System.out.println(decipher.decrypt(encryptedText));
    }

    public String decrypt(String text) {
        int partSize = (int) Math.ceil((double) text.length() / 3);
        StringBuilder decrypted = new StringBuilder();
        for (int i = 0; i < partSize; i++) {
            for (int j = i; j < text.length(); j += partSize) {
                decrypted.append(text.charAt(j));
            }
        }
        return decrypted.toString();
    }
}