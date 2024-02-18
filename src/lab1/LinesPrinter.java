package lab1;

public class LinesPrinter {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java LinesPrinter <n>");
            return;
        }
        if (args[0].matches("\\D")) {
            System.out.println("Error: <n> must be a number");
            return;
        }
        int n = Integer.parseInt(args[0]);

        String line = "Hello, World!";

        for (int i = 0; i < n; i++) {
            System.out.println(line);
        }

        for (int i = 0; i < n; i++) {
            System.out.print(line);
        }
    }
}
