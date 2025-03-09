// Write a Java program to compute compound interest using the formula A = P(1 + r/n)^(nt).
import java.util.Scanner;
public class Compound_Interest {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter principal amount: ");
            double P = sc.nextDouble();
            System.out.print("Enter annual interest rate (as a decimal): ");
            double r = sc.nextDouble();
            System.out.print("Enter the number of times interest is compounded per year: ");
            int n = sc.nextInt();
            System.out.print("Enter the number of years: ");
            int t = sc.nextInt();

            double A = P * Math.pow((1 + r / n, (n * t));
            System.out.println("Compound Amount = "+ A);
        }
    }
}
