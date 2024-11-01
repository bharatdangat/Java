import java.awt.*;
import java.awt.event.*;
class Demo extends Frame implements ActionListener
{
  List l1,l2;
  Label l;
  TextField t1;
  Button b1,b2,b3,b4,b5,b6;
 Demo()
 {
   setVisible(true);
   setSize(500,500);
   setLayout(new FlowLayout());
  
   l1=new List(10);
   l2=new List(10);
   l1.add("pen");
   l1.add("pencil");
   l1.add("Book");
   l1.add("notebook");
   l=new Label("Enter Product");
   t1=new TextField(10);
   b1=new Button(">>");
    b2=new Button(">");
    b3=new Button("<<");
   b4=new Button("<");
  b5=new Button("OK");
   b6=new Button("REMOVE");
   
   add(l1); add(b1); add(b2); add(b3); add(b4); add(l2); add(l); add(t1); 
   add(b5); add(b6);
   b1.addActionListener(this);
   b2.addActionListener(this);
  b3.addActionListener(this);
 b4.addActionListener(this);
  b5.addActionListener(this);
   b6.addActionListener(this);
  
 }
  public void actionPerformed(ActionEvent ae)       //override
  {
     if(ae.getSource()==b1)                         //perform event
     {
             for(int i=0;i<l1.countItems();i++)
    {
        l2.add(l1.getItem(i));  //l2 madhe l1 madhle element add    karayche          
    }
     }
     if(ae.getSource()==b2)
     {
         l2.add(l1.getSelectedItem());
     }
     if(ae.getSource()==b3)
     {
         for(int i=0;i<l2.countItems();i++)
         {
               l1.add(l2.getItem(i));
         }
     }
     if(ae.getSource()==b4)
     {
         l1.add(l2.getSelectedItem());
     }
     if(ae.getSource()==b5)
     {
         l2.add(t1.getText());
     }
     if(ae.getSource()==b6)
     {
         l2.remove(l2.getSelectedItem());
     }
     
     
  }
 public static void main(String arg[])
 {
  new Demo();
 }
}
