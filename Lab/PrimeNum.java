package allen;
import java.util.Scanner;

public class PrimeNum {
	public static void main(String[] args) {
		Scanner SC= new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = SC.nextInt();
		
		if(n % 2 == 0) {
			System.out.println("It is not prime");
		}
		else {
			System.out.println("exit");
		}
			
	}
}
