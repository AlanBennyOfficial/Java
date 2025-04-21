import java.util.*;
import java.util.concurrent.*;

public class Program4 {
  static BlockingQueue<Integer> evenQ = new ArrayBlockingQueue<>(1);
  static BlockingQueue<Integer> oddQ  = new ArrayBlockingQueue<>(1);
  public static void main(String[] args){
    new Thread(() -> {
      Random r=new Random();
      try{
        while(true){
          int n=r.nextInt(100);
          if(n%2==0) evenQ.put(n);
          else oddQ.put(n);
          Thread.sleep(1000);
        }
      }catch(Exception e){}
    }).start();

    new Thread(() -> {
      try{
        while(true){
          int n=evenQ.take();
          System.out.println("Square: "+n*n);
        }
      }catch(Exception e){}
    }).start();

    new Thread(() -> {
      try{
        while(true){
          int n=oddQ.take();
          System.out.println("Cube: "+n*n*n);
        }
      }catch(Exception e){}
    }).start();
  }
}
