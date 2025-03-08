// Write a Java program to calculate the distance between two points (x₁, y₁) and (x₂, y₂) using the distance formula. 

import java.util.Scanner;
public class Distance{
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			
			System.out.print("Enter x1: ");
			float x1 = sc.nextFloat();
			System.out.print("Enter x2: ");
			float x2 = sc.nextFloat();
			System.out.print("Enter y1: ");
			float y1 = sc.nextFloat();
			System.out.print("Enter y2: ");
			float y2 = sc.nextFloat();
			
			float d = (float) Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
			System.out.println("Distance = " + d );
		}
	}
}
