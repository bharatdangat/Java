//ARITHMATIC CALCULATOR USING EVENT......................
import java.awt.*;

class Demo extends Frame  
{

TextField t1;
  Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16;
 Demo()
 {
     setVisible(true);
     setSize(900,900);
     setBackground(Color.white);
     setTitle("Simple Calculator"); 
     setLayout(new FlowLayout());
     
     b1=new Button("1");          b9=new Button("9");    
     b2=new Button("2");         b10=new Button("0");
     b3=new Button("3");          b11=new Button("+");
     b4=new Button("4");         b12=new Button("-");
     b5=new Button("5");          b13=new Button("*");
     b6=new Button("6");           b14=new Button("/");
     b7=new Button("7");            b15=new Button("=");
     b8=new Button("8");           b16=new Button("Clear");
     add(t1);
      add(b1); add(b2);  add(b3);  add(b4);  add(b5);  add(b6);  add(b7);  add(b8);  add(b9);  add(b10);  add(b11);  add(b12);      add(b13);  add(b14);  add(b15);  add(b16);   
         }
   public static void main(String arg[])
 {
  Demo ob=new Demo();
 }
}
