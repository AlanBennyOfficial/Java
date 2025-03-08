// Write a Java program to compute compound interest using the formula A = P(1 + r/n)^(nt).

import java.util.Scanner;

public class Compound_Interest {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter principal amount: ");
            double P = sc.nextDouble();
            System.out.print("Enter rate of interest: ");
            double r = sc.nextDouble();
            System.out.print("Enter number of times interest applied per time period: ");
            double n = sc.nextDouble();
            System.out.print("Enter number of time periods elapsed: ");
            double t = sc.nextDouble();
            
            double A = P * Math.pow((1 + r/n), (n*t));
            System.out.println("Compound Interest = " + A);
        }
    }
}
