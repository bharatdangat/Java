//write java program to display compound interst calculator.........
import java.awt.*;
class Demo extends Frame
{
  Label l1,l2,l3,l4,l5,l6,l7;
  TextField t1,t2,t3,t4,t5;
  Button b1,b2,b3;
   Demo()
   {
      setVisible(true);
      setSize(500,500);
      setLayout(new FlowLayout());
   
   l1=new Label("Compound Interest Calculator");
   Font f=new Font("Monospaced",Font.BOLD,30);
   l1.setFont(f);
   l1.setBackground(Color.yellow);
 l1.setForeground(Color.red);
   
   l7=new Label("                                                       ");
   l2=new Label("Principal amount ");
   l3=new Label("Interest Rate-%");
   l4=new Label("Time -yrs");
   l5=new Label("Total Amount");
   l6=new Label("Interest Amount");
   
   t1=new TextField(20);
   t2=new TextField(5);
   t3=new TextField(10);
   t4=new TextField(10);
   t5=new TextField(15);

   b1=new Button("Calculate ");
   b2=new Button("Clear ");
   b3=new Button("Close ");   
   add(l1); 
   add(l7);
    add(l2); add(t1);
   add(l3);  add(t2);
    add(l4);   add(t3);
   add(l5);  add(t4);
   add(l6); add(t5);
  add(b1); add(b2); add(b3);
 }
 public static void main(String arg[])
   {
     Demo ob=new Demo();
   }
}
