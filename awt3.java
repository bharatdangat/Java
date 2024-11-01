//crreate awt for addition and substraction.....
import java.awt.*;
class Demo extends Frame  
{
  Label  l1,l2,l3;
  TextField t1,t2,t3;
  Button b1,b2,b3,b4;
       Demo()     //default constructor
     {
          setVisible(true);
          setSize(400,400);
          setTitle("ADDTION");
          setBackground(Color.yellow);
          setLayout(new FlowLayout());             //vvvvvvvvvvimp
          
          
          l1=new Label("Enter No-1"); 
  Font f=new Font("Monospace ",Font.ITALIC,10);  
  l1.setFont(f);                                                  //memory allocaton
          l2=new Label("Enter No-2");
          l3=new Label("Result");
          
          t1=new TextField(10);
          t2=new TextField(10);
          t3=new TextField(10);
     
         b1=new Button("Addition");
         b1.setBackground(Color.pink);
         b2=new Button("Substraction");
         b2.setBackground(Color.red);
         b3=new Button("Clear");
         b3.setBackground(Color.green);
         b4=new Button("Exit ");
         b4.setBackground(Color.black);
         b4.setForeground(Color.white);
         add(l1);  add(t1); add(l2); add(t2); add(l3); add(t3);   //calling
         add(b1); add(b2); add(b3); add(b4); 
     }
     public static void main(String arg[])
     {
         Demo ob=new Demo();
     }
}
