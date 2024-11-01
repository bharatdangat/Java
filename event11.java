//change the font.............
import java.awt.*;
import java.awt.event.*;
class Demo extends Frame implements ActionListener
{
 Choice c1,c2;
 TextArea ta;
 List l1;
 Button b1;
 Demo()
 {
   setVisible(true);
   setSize(500,500);
   setLayout(new FlowLayout());
   

   c1=new Choice();
   c1.add("Arial");
   c1.add("Gigi");
   c1.add("Verdana");
   
   l1=new List();
   l1.add("REGULAR");
   l1.add("BOLD");
   l1.add("ITALIC");
  
  c2=new Choice();
  for(int i=10;i<=100;i++)
  {
     c2.add(i+"\n");
  }
  
  b1=new Button("OK");
  ta=new TextArea(20,50);
  add(c1);
   add(l1);
   add(c2);
   add(b1);
   add(ta);
 b1.addActionListener(this);
 }
 
 public void actionPerformed(ActionEvent ae)
 {
  if(ae.getSource()==b1)
  {
    //Font f=new Font("C059",Font.BOLD,30);
    String s1=c1.getSelectedItem();
    String s2=l1.getSelectedItem();
   Font f=new Font("Verdana",Font.BOLD,20);
   ta.setFont(f);
  }
 }
  public static void main(String arg[])
  {
      new Demo();
  }
}
