// 8. Write a Java program to perform arithmetic operations on complex numbers.

class Complex {
    double real, imag;

    public Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public Complex add(Complex c) {
        return new Complex(real + c.real, imag + c.imag);
    }

    public Complex subtract(Complex c) {
        return new Complex(real - c.real, imag - c.imag);
    }

    public Complex multiply(Complex c) {
        return new Complex(real * c.real - imag * c.imag, real * c.imag + imag * c.real);
    }

    public Complex divide(Complex c) {
        double denom = c.real * c.real + c.imag * c.imag;
        return new Complex((real * c.real + imag * c.imag) / denom, (imag * c.real - real * c.imag) / denom);
    }

    public String toString() {
        return String.format("%.2f + %.2fi", real, imag);
    }

    public static void main(String[] args) {
        Complex a = new Complex(3, 2);
        Complex b = new Complex(1, 7);

        System.out.println("Addition: " + a.add(b));
        System.out.println("Subtraction: " + a.subtract(b));
        System.out.println("Multiplication: " + a.multiply(b));
        System.out.println("Division: " + a.divide(b));
    }
}