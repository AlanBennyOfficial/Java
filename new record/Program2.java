// Write a Program to calculate marks of a student using multiple inheritance implemented 
// through interface. Class Student with data members rollNo, name, Stringcls and methods 
// to set and put data. Create another class test extended by class Student with data members 
// mark1, mark2, mark3 and methods to set and put data. Create interface sports with 
// members sportsWt = 5 and putWt(). Now let the class results extends class test and 
// implements interface sports. Write a Java program to read required data and display details 
// in a neat format. 

import java.util.*;
interface Sports{ int sportsWt=5; void putWt(); }
class Student{
  int roll; String name, cls;
  Student(int r,String n,String c){ roll=r; name=n; cls=c; }
  void putData(){ System.out.println(roll+" "+name+" "+cls); }
}
class Test extends Student{
  int m1,m2,m3;
  Test(int r,String n,String c,int a,int b,int d){
    super(r,n,c);
    m1=a; m2=b; m3=d;
  }
  void putDataT(){ System.out.println(m1+" "+m2+" "+m3); }
}
class Result extends Test implements Sports{
  int total;
  Result(int r,String n,String c,int a,int b,int d){
    super(r,n,c,a,b,d);
    total=m1+m2+m3+sportsWt;
  }
  public void putWt(){ System.out.println("Sports wt: "+sportsWt); }
  void display(){
    putData();
    putDataT();
    putWt();
    System.out.println("Total: "+total);
  }
}
public class Program2{
  public static void main(String[] args){
    Scanner s=new Scanner(System.in);
    Result r=new Result(
      s.nextInt(), s.next(), s.next(),
      s.nextInt(), s.nextInt(), s.nextInt()
    );
    r.display();
  }
}
