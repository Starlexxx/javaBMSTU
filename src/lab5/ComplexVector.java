package lab5;

public class ComplexVector {

    private final Complex[] vector;

    public static void main(String[] args) {
        try {
            ComplexVector v1 = new ComplexVector(3);
            ComplexVector v2 = new ComplexVector(3);
            ComplexVector v3 = ComplexVector.add(v1, v2);
            System.out.println(ComplexVector.ComplexVectorToString(v1) +
                    " + " +
                    ComplexVector.ComplexVectorToString(v2) +
                    " = " +
                    ComplexVector.ComplexVectorToString(v3)
            );
        } catch (ArithmeticException e) {
            System.out.println("Ошибка математической операции: " + e.getMessage());
        } catch (OutOfMemoryError e) {
            System.out.println("Ошибка: недостаточно памяти");
        } catch (Exception e) {
            System.out.println("Неизвестная ошибка: " + e.getMessage());
        }
    }

    public ComplexVector(int n) {
        vector = new Complex[n];
        for (int i = 0; i < n; i++) {
            vector[i] = Complex.random();
        }
    }

    public ComplexVector(Complex[] vector) {
        this.vector = vector;
    }

    public static ComplexVector add(ComplexVector v1, ComplexVector v2) {
        int n = v1.vector.length;
        Complex[] result = new Complex[n];
        for (int i = 0; i < n; i++) {
            result[i] = v1.vector[i].add(v2.vector[i]);
        }
        return new ComplexVector(result);
    }

    public static String ComplexVectorToString(ComplexVector v) {
        StringBuilder result = new StringBuilder();
        result.append("(");
        for (int i = 0; i < v.vector.length; i++) {
            result.append(v.vector[i].toString());
            if (i != v.vector.length - 1) {
                result.append(", ");
            }
        }
        result.append(")");
        return result.toString();
    }
}