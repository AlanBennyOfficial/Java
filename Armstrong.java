package allen;
import java.util.Scanner;
import java.lang.Math;

public class Armstrong {
	public static void main(String[] args) {
		Scanner SC= new Scanner(System.in);
		System.out.println("Enter the value:");
		int n = SC.nextInt();
		
		int num = n;
		int a = n%10;
		n = n/10;
		int b = n%10;
		n = n/10;
		int c = n%10;
		
		if(Math.pow(a,3) + Math.pow(b,3) + Math.pow(c,3) == num) {
			System.out.printf(" %d is Armstrong", num);
		}
		else {
			System.out.printf(" %d is not Armstrong", num);
		}
	}

}
