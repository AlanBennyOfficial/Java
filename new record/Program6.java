import javax.swing.*;
public class Program6 {
  public static void main(String[] args){
    JFrame f=new JFrame("Calc");
    JTextField t=new JTextField(); f.add(t,"North");
    JPanel p=new JPanel();
    String[] btn={"7","8","9","+","4","5","6","-","1","2","3","*","0","=","C","/"};
    for(String s:btn){
      JButton b=new JButton(s);
      b.addActionListener(e->{
        String c=e.getActionCommand();
        if(c.equals("C")) t.setText("");
        else if(c.equals("=")) t.setText(""+eval(t.getText()));
        else t.setText(t.getText()+c);
      });
      p.add(b);
    }
    f.add(p);
    f.setSize(400,400);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setVisible(true);
  }
  static int eval(String exp){
    return (int)new Object(){
      int pos=-1,ch;
      void next(){ ch=++pos<exp.length()?exp.charAt(pos):-1; }
      int parse(){ next(); int x=parseTerm(); while(ch=='+'||ch=='-'){ char op=(char)ch; next(); int y=parseTerm(); x=op=='+'?x+y:x-y;} return x; }
      int parseTerm(){ int x=parseFactor(); while(ch=='*'||ch=='/'){ char op=(char)ch; next(); int y=parseFactor(); x=op=='*'?x*y:x/y;} return x; }
      int parseFactor(){ int s=1; if(ch=='-'){s=-1; next();} int x=0; while(Character.isDigit(ch)){x=x*10+ch-'0'; next();} return x*s; }
    }.parse();
  }
}
