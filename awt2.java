//create frame in java METHOD-2

//NOTE-IN THIS METHOD WE CAN EXTEND INBUILT FRAME CLASS TO THE DEMO CLASS AND WE CREATE DEFAULT CONSTRUCTOR THAT CALL AUTOMATICALLY WHEN CLASS OBJECT WAS CREATED.(it is widely used).................................
import java.awt.*;
class Demo extends Frame       //hece we can not create frame class......... 
{
   Demo()              //default constructor..........
   { 
        setVisible(true);                            //direct method calling.......  
        setSize(400,400);
        setLocation(100,200);
        setTitle("Welcome To Java");
        setBackground(Color.blue);
   }
   public static void main(String arg[])
   {
        Demo ob=new Demo();            //called default constructor automatically....
   }
}

