//write java program to select sublect using awt...
import java.awt.*;
class Demo extends Frame
{
   Label l1;
   Checkbox c1,c2,c3,c4,c5;
   Button b1;
 Demo()
 {
         setVisible(true);
          setSize(500,500);
          setBackground(Color.pink);
          setTitle("Select Subject");
          setLayout(new GridLayout(7,1));
          
          l1=new Label("Select Subjects");
          c1=new Checkbox("java");
          c2=new Checkbox("php");
          c3=new Checkbox("os");
          c4=new Checkbox("ds");
          c5=new Checkbox("tcs");
          b1=new Button("OK");
          add(l1); 
          add(c1); add(c2); add(c3); add(c4); add(c5);
          add(b1);
 }
 public static void main(String arg[])
 {
    Demo ob=new Demo();
 }
}
