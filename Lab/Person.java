package allen;

import java.util.Scanner;

//import java.util.Scanner;

class Person{
	
	String name;
	int age;
	
	public void readDetails() {
		Scanner sc = new Scanner(System.in); 
		System.out.print("Enter name and age: ");
		name = sc.nextLine();
		age = sc.nextInt();
		
		
	}
	
	public Person() {
		
	}
	
	
	public static void main(String[] args) {
		int m1 = 2;
		int m2 = 2;
		int m3 = 2;
		int total = 3;
		int avg = 2;
		int result = 4;
		
		
		
		
		System.out.print("\t|" + m1);
		System.out.print("\t|" + m2);
		System.out.print("\t|" + m3);
		System.out.print("\t|" + total);
		System.out.print("\t|" + avg);
		System.out.print("\t|" + result);
		System.lineSeparator();
		
	}
} 

class Student extends Person{
	
	int regno;
	double m1, m2, m3, total, avg;
	String result;
	
	public void getDetails() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter regno and marks in 3 subjects");
		regno = sc.nextInt();
		sc.nextLine();
		m1 = sc.nextDouble();
		sc.nextLine();
		m2 = sc.nextDouble();
		sc.nextLine();
		m3 = sc.nextDouble();
		sc.nextLine();
	}
	
	
			
	System.out.println("\t__________________________________________________________________________________________________________");
	System.out.println("\t| Name\t| Age\t| Reg No:\t| M1\t| M2\t| M3\t| Total\t| Avg\t| Result\t|");
	System.out.println("\t__________________________________________________________________________________________________________");
	
	for (int i = 0; i<n; i++)
		s[i].displayDetails();
	System.out.println("\t__________________________________________________________________________________________________________");
}
