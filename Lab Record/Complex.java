// From: Anish
import java.util.Scanner;  
public class Complex {  
    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);  
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt();  

        System.out.println((a + c) + " + " + (b + d) + "i");  
        System.out.println((a - c) + " + " + (b - d) + "i");  
        System.out.println((a * c - b * d) + " + " + (a * d + b * c) + "i");  

        double denominator = c * c + d * d;  
        double realPart = (double) (a * c + b * d) / denominator;  
        double imagPart = (double) (b * c - a * d) / denominator;  
        System.out.println(realPart + " + " + imagPart + "i");  

        sc.close();
    }  
}