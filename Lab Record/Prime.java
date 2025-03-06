import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {
		try (Scanner SC = new Scanner(System.in)) {
            System.out.println("Enter the number:");
            int n = SC.nextInt();
            
            if(n % 2 == 0 && n != 2) {
            	System.out.println("It is not prime");
            }
            else {
            	System.out.println("It is prime");
            }
        }	
	}
}
