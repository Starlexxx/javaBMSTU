package lab5;

public class QuadraticEquation {
    private final double a;
    private final double b;
    private final double c;

    public QuadraticEquation() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public QuadraticEquation(QuadraticEquation q) {
        this.a = q.a;
        this.b = q.b;
        this.c = q.c;
    }

    public double[] findRoots() throws ArithmeticException {
        double discriminant = b * b - 4 * a * c;
        if (discriminant < 0) {
            throw new ArithmeticException("No real roots");
        } else if (discriminant == 0) {
            return new double[]{-b / (2 * a)}; // one real root
        } else {
            double sqrtDiscriminant = Math.sqrt(discriminant);
            return new double[]{(-b - sqrtDiscriminant) / (2 * a), (-b + sqrtDiscriminant) / (2 * a)}; // two real roots
        }
    }

    public double findExtremum() throws ArithmeticException {
        if (a == 0) {
            throw new ArithmeticException("No extremum for a linear function");
        }
        return -b / (2 * a);
    }

    public String findDecreasingInterval() throws ArithmeticException {
        if (a == 0) {
            throw new ArithmeticException("No decreasing interval for a linear function");
        }
        if (a > 0) {
            return "(-Infinity, " + findExtremum() + ")";
        } else {
            return "(" + findExtremum() + ", +Infinity)";
        }
    }

    public String findIncreasingInterval() throws ArithmeticException {
        if (a == 0) {
            throw new ArithmeticException("No increasing interval for a linear function");
        }
        if (a > 0) {
            return "(" + findExtremum() + ", +Infinity)";
        } else {
            return "(-Infinity, " + findExtremum() + ")";
        }
    }
}