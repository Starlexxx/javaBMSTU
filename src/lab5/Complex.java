package lab5;

public class Complex {
    private double real;
    private double imaginary;

    public Complex() {
        this.real = 0;
        this.imaginary = 0;
    }

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public Complex(Complex c) {
        this.real = c.real;
        this.imaginary = c.imaginary;
    }

    public String toString() {
        return real + " + " + imaginary + "i";
    }

    public static Complex random() {
        return new Complex(Math.random(), Math.random());
    }

    public Complex add(Complex c) {
        return new Complex(this.real + c.real, this.imaginary + c.imaginary);
    }

    public Complex subtract(Complex c) {
        return new Complex(this.real - c.real, this.imaginary - c.imaginary);
    }

    public Complex multiply(Complex c) {
        return new Complex(this.real * c.real - this.imaginary * c.imaginary,
                this.real * c.imaginary + this.imaginary * c.real);
    }

    public Complex divide(Complex c) throws ArithmeticException {
        double denominator = c.real * c.real + c.imaginary * c.imaginary;
        if (denominator == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return new Complex((this.real * c.real + this.imaginary * c.imaginary) / denominator,
                (this.imaginary * c.real - this.real * c.imaginary) / denominator);
    }

    public void assign(Complex c) {
        this.real = c.real;
        this.imaginary = c.imaginary;
    }
}