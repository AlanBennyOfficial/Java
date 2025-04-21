import java.awt.*;
import javax.swing.*;

public class Program5 {
  public static void main(String[] args){
    JFrame f=new JFrame("Form");
    f.setLayout(new GridLayout(0,2));
    f.add(new JLabel("Name:")); JTextField t=new JTextField(); f.add(t);
    f.add(new JLabel("Gender:"));
    JPanel p=new JPanel();
    JRadioButton m=new JRadioButton("M"), w=new JRadioButton("F");
    ButtonGroup bg=new ButtonGroup(); bg.add(m); bg.add(w);
    p.add(m); p.add(w); f.add(p);
    f.add(new JLabel("Hobby:")); JCheckBox c=new JCheckBox("Music"); f.add(c);
    JButton b=new JButton("Submit");
    b.addActionListener(e-> JOptionPane.showMessageDialog(f, "Submitted") );
    f.add(b);
    f.setSize(300,200);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setVisible(true);
  }
}
