//write java program to select faculties using awt...
import java.awt.*;
class Demo extends Frame
{
   Label l1;
   Choice c;
   Button b1;
 Demo()
 {
         setVisible(true);
          setSize(500,500);
          setBackground(Color.pink);
          setTitle("Select Subject");
          setLayout(new FlowLayout());
          
          l1=new Label("Select Subjects");
          add(l1); 
          c=new Choice();
          add(c);
          c.add("java"); c.add("php"); c.add("os"); c.add("ds"); c.add("data science");
          add(b1);
 }
 public static void main(String arg[])
 {
    Demo ob=new Demo();
 }
}
