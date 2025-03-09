// 4. Write a Java program to calculate the perimeter and area of a given shape (circle, rectangle, or square).
import java.util.Scanner;

public class Perimeter_Area {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("1. Circle\n2. Rectangle\n3. Square");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.print("Enter radius: ");
                    double r = sc.nextDouble();
                    System.out.println("Perimeter: " + 2 * Math.PI * r);
                    System.out.println("Area: " + Math.PI * r * r);
                }
                case 2 -> {
                    System.out.print("Enter length: ");
                    double l = sc.nextDouble();
                    System.out.print("Enter breadth: ");
                    double b = sc.nextDouble();
                    System.out.println("Perimeter: " + 2 * (l + b));
                    System.out.println("Area: " + l * b);
                }
                case 3 -> {
                    System.out.print("Enter side: ");
                    double side = sc.nextDouble();
                    System.out.println("Perimeter: " + 4 * side);
                    System.out.println("Area: " + side * side);
                }
                default -> System.out.println("Invalid choice");
            }
        }
    }
}
