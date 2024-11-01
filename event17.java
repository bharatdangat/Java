//accept string and display resulted string in uppercase,lowercase and display  length()...........
import java.awt.*;
import java.awt.event.*;
class Demo extends Frame implements ActionListener
{
 Label l1,l2;
 TextField t1,t2;
 Button b1,b2,b3;
  Demo()
  {
    setVisible(true);
    setSize(500,500);
    setLayout(new FlowLayout());
  
   l1=new Label("Enter String");
   l2=new Label("Resulted  String");
   t1=new TextField(15);
   t2=new TextField(15);
   b1=new Button("LowerCase");
  b2=new Button("UpperCase");
  b3=new Button("Length");
  add(l1); add(t1); add(l2); add(t2); add(b1); add(b2); add(b3); 
  b1.addActionListener(this);   //add refference
  b2.addActionListener(this);
  b3.addActionListener(this);
  }
  public void actionPerformed(ActionEvent ae)
  {
    if(ae.getSource()==b1)
    {
       String s1=t1.getText();
       t2.setText(s1.toLowerCase());
    }
    if(ae.getSource()==b2)
    {
       String s1=t1.getText();
       t2.setText(s1.toUpperCase());
    }
     if(ae.getSource()==b3)
    {
       String s1=t1.getText();
       t2.setText(String.valueOf(s1.length())); //convert int value of length into string,,,,,,,,,,, imp.................
    }
  }
  public static void main(String arg[])
  {
    new Demo();
  }
}
