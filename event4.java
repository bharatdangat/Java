//create Number action using event
import java.awt.*;
import java.awt.event.*;      //import package
import java.lang.Integer;
class Demo extends Frame implements ActionListener         //implements Listner            interface
{
  Label l1,l2,l3,l4;
  TextField t1,t2,t3;
  Button b1,b2,b3;
   Demo()
   { 
       setVisible(true);
       setSize(500,500);
       setBackground(Color.green);
       setLayout(new FlowLayout());
       
       l1=new Label("Number Addition:");
       l2=new Label("First Number ");
       l3=new Label("Second Number ");
       l4=new Label("Result");
       
       t1=new TextField(10);
       t2=new TextField(10);
       t3=new TextField(10);
       
       b1=new Button("Add");
       b2=new Button("Clear");
       b3=new Button("Exit");
       
       add(l1); add(l2); add(t1); add(l3); add(t2); add(l4); add(t3); add(b1); add(b2); add(b3);
   
         b1.addActionListener(this);      //add event refference
         b2.addActionListener(this);
         b3.addActionListener(this);
     }
     public void actionPerformed(ActionEvent ae)         //ovverride mathod
    {
           if(ae.getSource()==b1)                            //event handling
      {
           String s1=t1.getText();
           String s2=t2.getText();
           int a=Integer.parseInt(s1);
           int b=Integer.parseInt(s2);
           int c=a+b;
           t3.setText(""+c);
      }
      if(ae.getSource()==b2)
      {
           t1.setText(" ");
           t2.setText(" ");
           t3.setText(" ");
      }
      if(ae.getSource()==b3)
      {
          dispose();
      }
    }
    
    public static void main(String arg[])
    {
        Demo ob=new Demo();
    }
}
