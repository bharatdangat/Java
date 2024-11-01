import java.awt.*;
import java.awt.event.*;
class MouseDemo extends Frame implements MouseListener
{
  TextField t1;
  MouseDemo()
  {
    setVisible(true);
    setLayout(new FlowLayout());
    setSize(500,500);
    
    t1=new TextField(20);
    add(t1);
    
    addMouseListener(this);
  }
  public void mouseClicked(MouseEvent me)
  {
     t1.setText("Mouse Click Zala..........");
  }
  public void mousePressed(MouseEvent me)
  {
     t1.setText("Mouse press Zala..........");
  }
  public void mouseReleased(MouseEvent me)
  {
     t1.setText("Mouse released Zala..........");
  }
  public void mouseEntered(MouseEvent me)
  {
     t1.setText("Mouse entered Zala..........");
  }
  public void mouseExited(MouseEvent me)
  {
     t1.setText("Mouse exit Zala..........");
  }
  
  public static void main(String arg[])
  {
     MouseDemo ob=new MouseDemo();
  }
  
}
