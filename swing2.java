//generate any two random numbers and print the numbers........
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.lang.Integer;
class Demo extends JFrame implements ActionListener
{
 JLabel l1;
 JButton b1;
 Demo()
 {
    setVisible(true);
    setSize(500,500);
    setLayout(new FlowLayout());
    l1=new JLabel("Random Numbers");
    b1=new JButton("OK");
     add(l1); add(b1);
    
    b1.addActionListener(this);
 }
 public void actionPerformed(ActionEvent ae)
 {
  if(ae.getSource()==b1)
  {
       random r1=new random();
       int a=r1.nextInt(100);
       int b=r1.nextInt(100);
       JOptionPane.showMessageDialog(this,"Value1="+a+"value2="+b);
  }
 }
  public static void main(String arg[])
  {
    new Demo();
  }
}
