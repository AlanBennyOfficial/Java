// Write a Java program to find the average of N numbers entered by the user.

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number of elements: ");
            int n = sc.nextInt();
            System.out.print("Enter " + n + " numbers:");

            float[] num = new float[n];
            float sum = 0;
            for (int i = 0; i < n; i++) {
                num[i] = sc.nextFloat();
                sum += num[i];
            }
            
            System.out.println("Average of " + n + " numbers is: " + sum / n);
        }
    }
}
