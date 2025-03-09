// 8. Write a Java program to perform arithmetic operations on complex numbers.

import java.util.Scanner;

public class Ops_Complex_Num{
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter the real and imaginary parts of the first complex number: ");
            double real1 = sc.nextDouble();
            double img1 = sc.nextDouble();
            
            System.out.println("Enter the real and imaginary parts of the second complex number: ");
            double real2 = sc.nextDouble();
            double img2 = sc.nextDouble();
            
            System.out.println("The sum of the two complex numbers is: " + (real1 + real2) + " + " + (img1 + img2) + "i");
            System.out.println("The difference of the two complex numbers is: " + (real1 - real2) + " + " + (img1 - img2) + "i");
            System.out.println("The product of the two complex numbers is: " + (real1 * real2 - img1 * img2) + " + " + (real1 * img2 + img1 * real2) + "i");
            System.out.println("The division of the two complex numbers is: " + (real1 * real2 + img1 * img2) / (real2 * real2 + img2 * img2) + " + " + (img1 * real2 - real1 * img2) / (real2 * real2 + img2 * img2) + "i");
        }
    }
    
}
