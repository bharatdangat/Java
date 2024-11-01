//write java program to create two button namely red and blue and green when button is pressed background color should be that button

import java.awt.*;
import java.awt.event.*;
class Demo extends Frame implements ActionListener
{
 Button b1,b2,b3;
  Demo()
  {
    setVisible(true);
    setSize(500,500);
    setLayout(new FlowLayout());
  
   b1=new Button("Red");
    b2=new Button("Blue");
     b3=new Button("Green");
    add(b1); add(b2); add(b3);
    
    b1.addActionListener(this);
    b2.addActionListener(this);
    b3.addActionListener(this);
  }
  
  public void actionPerformed(ActionEvent ae)
  {
     if(ae.getSource()==b1)
     {
           setBackground(Color.red);
     }
     if(ae.getSource()==b2)
     {
           setBackground(Color.blue);
     }
     if(ae.getSource()==b3)
     {
           setBackground(Color.green);
     }
  }
   public static void main(String arg[])
   {
     new Demo();
   }
}
