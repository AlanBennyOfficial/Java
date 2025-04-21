import java.sql.*;
public class Program11 {
  public static void main(String[] args) throws Exception {
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection c=DriverManager.getConnection(
      "jdbc:mysql://localhost:3306/JavaSample","root","pass"
    );
    Statement s=c.createStatement();
    s.executeUpdate("INSERT INTO yourTable(col1,col2) VALUES('v1','v2')");
    s.executeUpdate("UPDATE yourTable SET col2='new' WHERE col1='v1'");
    s.executeUpdate("DELETE FROM yourTable WHERE col1='v1'");
    c.close();
  }
}
