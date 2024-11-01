//write java program to accept three  values from user and dislay largrst value..
import java.awt.*;
import java.awt.event.*;
import java.lang.Integer;
class Demo extends Frame implements ActionListener
{
 Label l1,l2,l3,l4;
 TextField t1,t2,t3;
 Button b1;
  Demo()
  {
     setVisible(true);
     setSize(500,500);
     setLayout(new FlowLayout());
     l1=new Label("Enter First Number");
     l2=new Label("Enter Second Number");
     l3=new Label("Enter Third Number");
     l4=new Label("Maximum from 3 Nos");
     t1=new TextField(10);
     t2=new TextField(10);
     t3=new TextField(10);
     b1=new Button("OK");
  add(l1); add(t1); add(l2); add(t2); add(l3); add(t3);
  add(l4); add(b1);

b1.addActionListener(this);
}
 public void actionPerformed(ActionEvent ae)
 {
   if(ae.getSource()==b1)
   {
       String s1=t1.getText();
       String s2=t2.getText();
       String s3=t3.getText();
       int a=Integer.parseInt(s1);
       int b=Integer.parseInt(s2);
       int c=Integer.parseInt(s3);
       if(a>b&&a>c)
       l4.setText("First Number is Greater="+a);
       else if(b>a&&b>c)
       l4.setText("Second Number is Greater="+b);
       else l4.setText("Third Number is Greater="+c);
   }
 }
  public static void main(String arg[])
  {
   new Demo();
  }
}
