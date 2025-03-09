// Write a Java program to convert temperature from Celsius to Fahrenheit and vice versa.

import java.util.Scanner;
public class Temperature {
    // convert from celcius to fahrenheit and vice versa
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("What do you want to convert?\n1. Celsius into Farenheight(type 1)\n2. Fraenheight into Celsius(type 2)\nInput:");
            int n = sc.nextInt();

            if (n==1){
                System.out.print("Enter temperature in Celsius: ");
                double celsius = sc.nextDouble();
                double fahrenheit = (celsius * 9 / 5) + 32;
                System.out.println(celsius + "°C is " + fahrenheit + "°F");
            }
            else {
                System.out.print("Enter temperature in Fahrenheit: ");
                double fahrenheit = sc.nextDouble();
                double celsius = (fahrenheit - 32) * 5 / 9;
                System.out.println(fahrenheit + "°F is " + celsius + "°C");
            }
        }
    }
}