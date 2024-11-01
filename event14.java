import java.awt.*;
import java.awt.event.*;
class WindowDemo extends Frame implements WindowListener
{
 WindowDemo()
 {
   setVisible(true);
   setSize(500,500);
   setLayout(new FlowLayout());
  
  addWindowListener(this);
}

public void windowOpened(WindowEvent we)
{
  setTitle("opened");
}
public void windowClosed(WindowEvent we)
{
  setTitle("Closed");
}
public void windowClosing(WindowEvent we)
{
  setTitle("Closing");
  dispose();
}
public void windowDeactivated(WindowEvent we)
{
  setTitle("Deactivated");
}
public void windowActivated(WindowEvent we)
{
  setTitle("Activated.");
}
public void windowDeiconified(WindowEvent we)
{
  setTitle("Deiconified.");
}

public void windowIconified(WindowEvent we)
{
  setTitle("Iconified");
}

 
public static void main(String arg[])
{
 new WindowDemo();
}
}
