// Write a Java program to check whether a given number is prime or not.

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number: ");
            int n = sc.nextInt();

            if (n < 2) {
                System.out.println("It is not prime");
            } else {
                boolean isPrime = true;
                for (int i = 2; i <= Math.sqrt(n); i++) {
                    if (n % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime)
                    System.out.println("It is prime");
                else
                    System.out.println("It is not prime");
            }
        }
    }
}
