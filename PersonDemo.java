/**Write a Java program to create a class called "Person"
 * with a name and age attribute. Create two instances of
 * the "Person" class, set their attributes using the constructor,
 * and print their name and age.
*/
import java.util.Scanner;
class Person
{
    String name;
    int age;
   
    public void readDetails(Scanner sc)
    {
        System.out.print("Enter name and age: ");
        name = sc.nextLine();
        age = sc.nextInt();
        sc.nextLine(); // Consume the newline character
    }
   
}

class Student extends Person
{
    int regNo;
    double m1,m2,m3,total,avg;
    String result;
   
    public void getDetails(Scanner sc)
    {
        System.out.println("Enter Regno and marks in 3 subjects");
        regNo = sc.nextInt();
        sc.nextLine(); // Consume the newline character
        m1 = sc.nextDouble();
        sc.nextLine(); // Consume the newline character
        m2 = sc.nextDouble();
        sc.nextLine(); // Consume the newline character
        m3 = sc.nextDouble();
        sc.nextLine(); // Consume the newline character
    }
   
    public void calResult()
    {    
        total = m1 + m2 + m3;
        avg = total/3.0;
        if(avg>80)
            result = "Distinction";
        else if(avg>60)
            result = "First Class";
        else if(avg>50)
            result = "Second Class";
        else if(avg>40)
            result = "Just Pass";
        else
            result = "Fail";
       
    }
    public void displayDetails()
    {
        System.out.print(" \t| " + name);
        System.out.print(" \t| " + age);
        System.out.print(" \t| " + regNo);
        System.out.print(" \t| " + m1);
        System.out.print(" \t| " + m2);
        System.out.print(" \t| " + m3);
        System.out.print(" \t| " + total);
        System.out.print(" \t| " + avg);
        System.out.print(" \t| " + result);
        System.out.println();
    }
}

public class PersonDemo {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter total number of students: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        if (n > 20 || n <= 0) {
            System.out.println("Invalid number of students. Please enter a number between 1 and 20.");
            return;
        }

        Student[] students = new Student[n];
        for (int i = 0; i < n; i++) {
            students[i] = new Student();
            students[i].readDetails(scanner); // Pass Scanner instance
            students[i].getDetails(scanner); // Pass Scanner instance
            students[i].calResult();
        }

        System.out.println(" \t___________________________________________________________________________________");
        System.out.println(" \t| Name \t| Age \t|Reg No\t| M1 \t| M2 \t| M3 \t| Total\t\t| Avg\t| Result |");
        System.out.println(" \t___________________________________________________________________________________");

        for (Student student : students) {
            student.displayDetails();
        }

        System.out.println(" \t____________________________________________________________________________________");
    }
}