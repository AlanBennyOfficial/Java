package allen;
import java.util.Scanner;

public class Age {
	public static void main(String[] args) {
		String name = new String();
		int age;
		Scanner SC= new Scanner(System.in);
		
		
		System.out.println("Enter name: ");
		name = SC.nextLine();
		
		System.out.println("Enter age: ");
		age = SC.nextInt();
		
		
		if(age < 16) {
			System.out.printf("You can't drive, %s", name);
		}
		else if(age > 15 && age < 18) {
			System.out.printf("You can drive but you not vote, %s", name);
		}
		else if(age > 17 && age < 25) {
			System.out.printf("You can vote but not rent a car, %s", name);
		}
		else {
			System.out.printf("You can do pretty much anything, %s", name);
		}
	}
}
