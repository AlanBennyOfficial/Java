import java.io.*;
import java.util.*;
public class Program9 {
  public static void main(String[] args) throws Exception {
    Scanner s=new Scanner(System.in);
    System.out.print("Source: "); String src=s.next();
    System.out.print("Target: "); String dst=s.next();
    File f=new File(dst);
    if(f.exists()){
      System.out.print("Overwrite? (y/n): ");
      if(!s.next().equalsIgnoreCase("y")) return;
    }
    try(FileInputStream in=new FileInputStream(src);
        FileOutputStream out=new FileOutputStream(dst)){
      byte[] buf=new byte[1024];
      int n;
      while((n=in.read(buf))!=-1) out.write(buf,0,n);
    }
  }
}
