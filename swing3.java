import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Demo extends JFrame implements ActionListener
{
 JLabel l1,l2,l3;
 JButton b1,b2,b3;
 Demo()
 {
  setVisible(true);
  setSize(400,400);
  setLayout(new FlowLayout());
  l1=new JLabel("Image 1");
  l2=new JLabel("Image 2");
  l3=new JLabel("Image 3");
  b1=new JButton("OK");
  b2=new JButton("OK");
  b3=new JButton("OK");
  
  add(l1); add(b1); add(l2); add(b2); add(l3); add(b3);
  b1.addActionListener(this);
 }
 public void actionPerformed(ActionEvent ae)
 {
   if(ae.getSource()==b1)
   {
       ImageIcon img=new ImageIcon("images.jpeg");
         }
 }
 public static void main(String arg[])
 {
  new Demo();
 }
}

