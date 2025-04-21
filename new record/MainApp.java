import interest.SimpleInterest;
import java.util.*;
import tempconv.TempConverter;

public class MainApp {
  public static void main(String[] args){
    Scanner s=new Scanner(System.in);
    System.out.println("Enter C to convert to F:");
    System.out.println("Fahrenheit: "+TempConverter.toF(s.nextDouble()));
    System.out.println("Enter P, R, T for Simple Interest:");
    System.out.println("Simple Interest: "+
      SimpleInterest.calc(
        s.nextDouble(), s.nextDouble(), s.nextDouble()
      )
    );
  }
}
