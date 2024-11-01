//check Number is even or odd using swing.......
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.lang.Integer;
class Demo extends JFrame implements ActionListener
{
 JLabel l1;
 JTextField t1;
 JButton b1;
 Demo()
 {
    setVisible(true);
    setSize(500,500);
    setLayout(new FlowLayout());
    l1=new JLabel("Enter No");
    t1=new JTextField(10);
    b1=new JButton("OK");
    add(l1); add(t1); add(b1);
    
    b1.addActionListener(this);
 }
 public void actionPerformed(ActionEvent ae)
 {
  if(ae.getSource()==b1)
  {
     int n=Integer.parseInt(t1.getText());
     if(n%2==0)
     JOptionPane.showMessageDialog(this,"Number is even.....");
     else
     JOptionPane.showMessageDialog(this,"Number is odd..........");
  }
 }
  public static void main(String arg[])
  {
   new Demo();
  }
}
