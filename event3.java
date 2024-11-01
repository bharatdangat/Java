//accept product and list the product usimg list
import java.awt.*;
import java.awt.event.*;     //import package
class Demo extends Frame  implements ActionListener  //implements Listner interfce
{
    Label l1,l2;
    TextField t1;
    Button b1,b2,b3;
    List lst;
   Demo()
   {
  setVisible(true);
  setBackground(Color.pink);
 setLayout(new FlowLayout());
  setSize(500,500);
  
   l1=new Label("Enter product");
   l2=new Label("All Product");
   t1=new TextField(10);
   b1=new Button("Add");
   b2=new Button("Remove");
   b3=new Button("Clear All");
   lst=new List(10);
   
   add(l1); add(t1); add(l2); add(lst); add(b1); add(b2); add(b3);
     b1.addActionListener(this); //add event refference
     b2.addActionListener(this);
     b3.addActionListener(this);
     
   }
    public  void actionPerformed(ActionEvent ae )     //ovverride method.......
   {
         if(ae.getSource()==b1)       //handle event
    {
           String s1=t1.getText();
           lst.add(s1);
   }
   if(ae.getSource()==b2)       //handle event
    {
           lst.remove(lst.getSelectedItem());
   }
   if(ae.getSource()==b3)       //handle event
    {
           lst.clear();
   }
   }
   public static void main(String arg[])
   {
      Demo ob=new Demo();
   }
}
