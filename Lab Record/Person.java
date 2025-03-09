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
        Person p = new Person("John", 25);
        p.display();
    }
}
