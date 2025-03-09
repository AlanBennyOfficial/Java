// Write a Java program to define a class Person with attributes name and age, and display the details of a person.

public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Name: " + name + "\nAge: " + age);
    }

    public static void main(String[] args) {
        try(java.util.Scanner sc = new java.util.Scanner(System.in)){
            System.out.print("Enter name: ");
            String name = sc.nextLine();
            System.out.print("Enter age: ");
            int age = sc.nextInt();
            Person p = new Person(name, age);
            p.display();
        }
    }
}
