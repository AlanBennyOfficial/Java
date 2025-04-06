package allen;
import java.util.Scanner;

public class Tables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner SC= new Scanner(System.in);
		System.out.println("Enter the value:");
		int n = SC.nextInt();
		
		for(int i=1; i<11; i++) {
			System.out.printf("%d x %d = %d\n", n,i,n*i);
		}

	}
}