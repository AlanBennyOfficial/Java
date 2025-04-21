import java.awt.*;
import java.sql.*;
public class Program12 extends Frame {
  TextField nameF,emailF,contactF;
  Choice genderC,stateC;
  TextArea addrA;
  Button ins,upd,del;
  public Program12(){
    super("Register");
    setLayout(new FlowLayout());
    add(new Label("Name:")); nameF=new TextField(20); add(nameF);
    add(new Label("Gender:")); genderC=new Choice();
    genderC.add("M"); genderC.add("F"); add(genderC);
    add(new Label("Email:")); emailF=new TextField(20); add(emailF);
    add(new Label("Contact:")); contactF=new TextField(20); add(contactF);
    add(new Label("Address:")); addrA=new TextArea(5,20); add(addrA);
    add(new Label("State:")); stateC=new Choice();
    stateC.add("State1"); stateC.add("State2"); add(stateC);
    ins=new Button("Insert"); upd=new Button("Update"); del=new Button("Delete");
    add(ins); add(upd); add(del);
    ins.addActionListener(e->db("INSERT"));
    upd.addActionListener(e->db("UPDATE"));
    del.addActionListener(e->db("DELETE"));
    setSize(350,450);
    setVisible(true);
  }
  void db(String op){
    try{
      Connection c=DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/yourDB","user","pass"
      );
      String sql = op.equals("INSERT")
        ? "INSERT INTO students(name,gender,email,contact,address,state) VALUES(?,?,?,?,?,?)"
        : op.equals("UPDATE")
          ? "UPDATE students SET name=?,gender=?,email=?,contact=?,address=?,state=? WHERE id=?"
          : "DELETE FROM students WHERE id=?";
      PreparedStatement p=c.prepareStatement(sql);
      if(!op.equals("DELETE")){
        p.setString(1,nameF.getText());
        p.setString(2,genderC.getSelectedItem());
        p.setString(3,emailF.getText());
        p.setString(4,contactF.getText());
        p.setString(5,addrA.getText());
        p.setString(6,stateC.getSelectedItem());
        if(op.equals("UPDATE")) p.setInt(7, 1); // adjust ID as needed
      } else {
        p.setInt(1, 1); // adjust ID as needed
      }
      p.executeUpdate();
      c.close();
    }catch(Exception e){}
  }
  public static void main(String[] args){
    new Program12();
  }
}
