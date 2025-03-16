package allen;
import java.util.Scanner;

public class Fib {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner SC= new Scanner(System.in);
		
		System.out.println("Enter the number of terms:");
		int n = SC.nextInt();
		
		int a = 0, b = 1, c;
		System.out.printf("%d, ", a);
		System.out.printf("%d, ", b);
		for(int i=3; i<=n; i++) {
			c = a + b;
			System.out.printf("%d, ", c );
			a = b;
			b = c;
		}
		
	}

}
