import java.awt.*;
import java.awt.event.*;
class Demo  extends Frame implements ActionListener
{
  Label l1,l2,l3;
  TextField t1;
  List l;
  Button b1,b2,b3;
  Demo()
  {
    setVisible(true);
    setLayout(new FlowLayout());
    setSize(500,500);
    
    l1=new Label("Enter Product-");
    l2=new Label("All Product");
    t1=new TextField(10);
    l=new List(10);
    b1=new Button("Add");
    b2=new Button("Remove");
    b3=new Button("Remove All");
    
    add(l1); add(t1); add(l2); add(l); add(b1); add(b2); add(b3);
    b1.addActionListener(this);
    b2.addActionListener(this);
    b3.addActionListener(this);
  }
    public void actionPerformed(ActionEvent ae)
    {
       if(ae.getSource()==b1)
       {
              String s1=t1.getText();
              l.add(s1);           //vvvvvimp (add) not setText()
       }
       if(ae.getSource()==b2)
       {
              l.remove(l.getSelectedItem());
     }
      if(ae.getSource()==b3)
       {
             l.clear();
     }
    }

   public static void main(String arg[])
   {
     new Demo();
   }
}
