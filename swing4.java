import javax.swing.*;
import java.awt.*;
import java. awt.event.*;
class Demo extends JFrame implements AdjustmentListener
{
 JScrollBar js1;
  TextField t1;
  Demo()
  {
  setSize(500,500);
  setVisible(true);
  setLayout(null);
  t1=new TextField(10);
  t1.setBounds(20,20,50,30);
  add(t1);
  
  js1=new JScrollBar();
  js1.setMinimum(50);
  js1.setMaximum(500);
  
  js1.setBounds(50,50,20,200);
  add(js1);
  js1.addAdjustmentListener(this);
  }
  public void adjustmentValueChanged(AdjustmentEvent ae)
  {
       int val=js1.getValue();
       t1.setText(""+val);
  }
  public static void main(String arg[])
  {
   new Demo();
  }
}

