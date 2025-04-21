import javax.swing.*;
public class Program7 {
  public static void main(String[] args){
    JFrame f=new JFrame("Book Shop");
    f.setLayout(new BoxLayout(f.getContentPane(),BoxLayout.Y_AXIS));
    JTextField code=new JTextField(), name=new JTextField(), price=new JTextField();
    f.add(new JLabel("Code:")); f.add(code);
    f.add(new JLabel("Name:")); f.add(name);
    f.add(new JLabel("Price:")); f.add(price);
    JButton b=new JButton("Calculate");
    b.addActionListener(e->{
      int c=Integer.parseInt(code.getText()), p=Integer.parseInt(price.getText());
      double d = c==101?0.15 : c==102?0.20 : c==103?0.25 : 0.05;
      double disc = p*d, net = p-disc;
      JOptionPane.showMessageDialog(f, "Discount: "+disc+" Net bill: "+net);
    });
    f.add(b);
    f.pack();
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setVisible(true);
  }
}
