// 8. Write a Java program to perform arithmetic operations on complex numbers.

import java.util.Scanner;

public class Ops_Complex_Num{
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter the real and imaginary parts of the first complex number: ");
            double real1 = sc.nextDouble();
            double img1 = sc.nextDouble();
            
            System.out.println("Enter the real and imaginary parts of the second complex number: ");
            double real2 = sc.nextDouble();
            double img2 = sc.nextDouble();
            
            System.out.println("The sum of the two complex numbers is: " + (real1 + real2) + " + " + (img1 + img2) + "i");
            System.out.println("The difference of the two complex numbers is: " + (real1 - real2) + " + " + (img1 - img2) + "i");
            System.out.println("The product of the two complex numbers is: " + (real1 * real2 - img1 * img2) + " + " + (real1 * img2 + img1 * real2) + "i");
            System.out.println("The division of the two complex numbers is: " + (real1 * real2 + img1 * img2) / (real2 * real2 + img2 * img2) + " + " + (img1 * real2 - real1 * img2) / (real2 * real2 + img2 * img2) + "i");
        }
    }
    
}

// Another method
/*
import java.util.Scanner;

class Complex
{
	private int real;
	private int img;
	
	public Complex()
	{
		real = 0;
		img = 0;
	}
	public Complex(int x)
	{
		real = x;
		img = x;
	}
	public Complex(int x ,int y)
	{
		real = x;
		img = y;
	}
	public void display()
	{
		System.out.println("The Complex Number is:"+ real + "+i" + img);
	}
	public void add(Complex A,Complex B)
	{
		this.real = A.real + B.real;
		this.img = A.img + B.img;	
	}
	public Complex sub(Complex A,Complex B)
	{
		Complex C = new Complex();
		C.real = A.real - B.real;
		C.img = A.img - B.img;
		return C;
	}
	public void mul(Complex A,Complex B)
	{
		this.real = (A.real*B.real)-(A.img*B.img);
		this.img = (A.real*B.real)+(A.img*B.img);
		
	}
	
}
public class ComplexNo
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		Complex c1 = new Complex();
		Complex c2 = new Complex(10);
		Complex c3 = new Complex(10,20);
		c1.display();
		c2.display();
		c3.display();
		
		System.out.print("Enter one value for real and imaginary part:");
		int x1 = sc.nextInt();
		Complex c_1 = new Complex(x1);
		
		System.out.print("Enter two value for real abd Imaginary Part:");
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		Complex c_2 = new Complex(x2,y2);
		
		Complex c_3 = new Complex();
		c_3.add(c_1, c_2);
		
		Complex c_4 = new Complex();
		c_4 = c_4.sub(c_1,c_2);
		
		Complex c_5 = new Complex();
		c_5.mul(c_1, c_2);
		
		c_3.display();
		c_4.display();
		c_5.display();
		sc.close();
		}
	
}
 */