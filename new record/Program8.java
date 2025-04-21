import java.io.*;
public class Program8 {
  public static void main(String[] args) throws Exception {
    BufferedReader r = new BufferedReader(new FileReader(args[0]));
    BufferedWriter w = new BufferedWriter(new FileWriter(args[1]));
    String line;
    while((line=r.readLine())!=null){
      w.write(line);
      w.newLine();
    }
    r.close();
    w.close();
  }
}
