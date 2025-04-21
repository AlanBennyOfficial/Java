// Program to implement the following class hierarchy:  
// a. Student: id, name.  
// b. StudentExam (derived from Student): Marks of 3subjects, total marks  
// c. StudentResult (derived from StudentExam) : percentage, grade.  
//         Define appropriate methods to accept and calculate grade based on existing criteria     
//         and display details of N students. 

import java.util.*;
class Student{int id;String name;Student(int i,String n){id=i;name=n;}}
class StudentExam extends Student{int m1,m2,m3,total;StudentExam(int i,String n,int a,int b,int c){super(i,n);m1=a;m2=b;m3=c;total=a+b+c;}}
class StudentResult extends StudentExam{
  double perc; char grade;
  StudentResult(int i,String n,int a,int b,int c){
    super(i,n,a,b,c);
    perc=total/3.0;
    grade=perc>=60?'A':perc>=50?'B':perc>=40?'C':'F';
  }
  void display(){ System.out.println(id+" "+name+" "+total+" "+perc+" "+grade); }
}
public class Program1{
  public static void main(String[] args){
    Scanner s=new Scanner(System.in);
    int N=s.nextInt();
    while(N-->0){
      new StudentResult(
        s.nextInt(), s.next(),
        s.nextInt(), s.nextInt(), s.nextInt()
      ).display();
    }
  }
}

