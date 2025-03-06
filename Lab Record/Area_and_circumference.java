
import java.util.Scanner;

class Circle{
	double radius;
	final double Pi = 3.14;
	public Circle(double r) {
		radius = r;
	}
	public double Area() {
		return Pi*radius*radius;
	}
	public double Circumference() {
		return 2*Pi*radius;
	}
}

class Area_and_circumference{
	public static void main(String[] args) {
		System.out.println("Enter the radius: ");
		try (Scanner SC = new Scanner(System.in)) {
			Circle C1 = new Circle(SC.nextDouble());
			System.out.println("Area of the circle: "+C1.Area());
			System.out.println("Circumference of the circle: "+C1.Circumference());
		}
	}
}
