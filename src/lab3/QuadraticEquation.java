package lab3;

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

    public double[] findRoots() {
        double discriminant = b * b - 4 * a * c;
        if (discriminant < 0) {
            return new double[]{}; // no real roots
        } else if (discriminant == 0) {
            return new double[]{-b / (2 * a)}; // one real root
        } else {
            double sqrtDiscriminant = Math.sqrt(discriminant);
            return new double[]{(-b - sqrtDiscriminant) / (2 * a), (-b + sqrtDiscriminant) / (2 * a)}; // two real roots
        }
    }

    public double findExtremum() {
        return -b / (2 * a);
    }

    public String findDecreasingInterval() {
        if (a > 0) {
            return "(-Infinity, " + findExtremum() + ")";
        } else if (a < 0) {
            return "(" + findExtremum() + ", +Infinity)";
        } else {
            return "No decreasing interval for a linear function";
        }
    }

    public String findIncreasingInterval() {
        if (a > 0) {
            return "(" + findExtremum() + ", +Infinity)";
        } else if (a < 0) {
            return "(-Infinity, " + findExtremum() + ")";
        } else {
            return "No increasing interval for a linear function";
        }
    }
}
