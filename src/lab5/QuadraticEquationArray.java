package lab5;

public class QuadraticEquationArray {
    public static void main(String[] args) {
        try {
            QuadraticEquation[] equations = new QuadraticEquation[]{
                    new QuadraticEquation(1, -3, 2),
                    new QuadraticEquation(1, -5, 6),
                    new QuadraticEquation(1, -1, -6)
            };

            double minRoot = Double.POSITIVE_INFINITY;
            double maxRoot = Double.NEGATIVE_INFINITY;

            for (QuadraticEquation equation : equations) {
                double[] roots = equation.findRoots();
                for (double root : roots) {
                    if (root < minRoot) {
                        minRoot = root;
                    }
                    if (root > maxRoot) {
                        maxRoot = root;
                    }
                }
            }

            System.out.println("Min root: " + minRoot);
            System.out.println("Max root: " + maxRoot);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка математической операции: " + e.getMessage());
        } catch (OutOfMemoryError e) {
            System.out.println("Ошибка: недостаточно памяти");
        } catch (Exception e) {
            System.out.println("Неизвестная ошибка: " + e.getMessage());
        }
    }
}