// 4. Write a Java program to calculate the perimeter and area of a given shape (circle, rectangle, or square).

public class Perimeter_Area {
    public static void main(String[] args) {
        try (java.util.Scanner sc = new java.util.Scanner(System.in)) {
            System.out.println("1. Circle\n2. Rectangle\n3. Square");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.print("Enter radius: ");
                    double radius = sc.nextDouble();
                    System.out.println("Perimeter: " + 2 * Math.PI * radius);
                    System.out.println("Area: " + Math.PI * radius * radius);
                }
                case 2 -> {
                    System.out.print("Enter length: ");
                    double length = sc.nextDouble();
                    System.out.print("Enter breadth: ");
                    double breadth = sc.nextDouble();
                    System.out.println("Perimeter: " + 2 * (length + breadth));
                    System.out.println("Area: " + length * breadth);
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
