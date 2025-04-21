import java.io.*;
public class Program10 {
  public static void main(String[] args) throws Exception {
    BufferedReader r=new BufferedReader(new FileReader(args[0]));
    String l; int lines=0, words=0;
    while((l=r.readLine())!=null){
      lines++;
      words += l.trim().isEmpty() ? 0 : l.trim().split("\\s+").length;
    }
    r.close();
    System.out.println("Lines: "+lines+" Words: "+words);
  }
}
