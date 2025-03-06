import java.util.Scanner;
public class Roots_Quadratic_Equation{
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)){
			double root1;
			double root2;
			System.out.println("To find root using x = (-b ± √ (b² – 4ac) )/2a");
			
			System.out.print("Enter a: ");
			float a = sc.nextFloat();
			
			System.out.print("Enter b: ");
			float b = sc.nextFloat();
			
			System.out.print("Enter c: ");
			float c = sc.nextFloat();
			
			float discriminant = b * b - 4 * a * c;	
			
			if (discriminant > 0) {
			      root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
			      root2 = (-b - Math.sqrt(discriminant)) / (2 * a);

			      System.out.format("root1 = %.2f and root2 = %.2f", root1, root2);
			    }
			else if (discriminant == 0) {
			      root1 = root2 = -b / (2 * a);
			      	
			      System.out.format("root1 = root2 = %.2f;", root1);
			    }
			else {
			      double real = -b / (2 * a);
			      double imaginary = Math.sqrt(-discriminant) / (2 * a);
			      System.out.format("root1 = %.2f+%.2fi", real, imaginary);
			      System.out.format("\nroot2 = %.2f-%.2fi", real, imaginary);
			    }
		}
		// x = (-b ± √ (b² – 4ac) )/2a
		// x = (-b ± √(b2-4ac)) / (2a)
		// root1 = (-b + √(b2-4ac)) / (2a)
		// root1 = (-b - √(b2-4ac)) / (2a)
		// x = [-b ± sqrt(b^2 - 4ac)] / 2a
	}
}