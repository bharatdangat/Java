//accept username and greet the message "Good morning (username)" and date and time
import java.util.*; //for date........
import java.awt.*;
import java.awt.event.*;
class Demo extends Frame implements ActionListener
{
  Label l1,l2,l3;
  TextField t1;
  Button b1;
 Demo()
 {
   setVisible(true);
   setSize(500,500);
   setLayout(new GridLayout(5,1));
   
  l1=new Label("Enter Username");
  t1=new TextField(10);
  l2=new Label("Greet Message-");
  l3=new Label("Date &Time-");
  b1=new Button("OK");
  add(l1); add(t1); add(l2); add(l3);  add(b1);
  b1.addActionListener(this);
 }
 public void actionPerformed(ActionEvent ae)
 {
    if(ae.getSource()==b1)
    {
       String s1=t1.getText();
        Date d1=new Date();
        int hr=d1.getHours();
        if(hr>=12&&hr<=18)
        l2.setText("Greet Message=Good Afternoon,"+s1);
        else if(hr>=19&&hr<=24)
        l2.setText("Greet Message=Good Night,"+s1);
        
        else l2.setText("Greet Message=Good Morning,"+s1);
    
    l3.setText("Date&Time="+d1);
    }
 }
 public static void main(String arg[])
 {
  new Demo();
 }
}
