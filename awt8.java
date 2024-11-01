//Job Application 
import java.awt.*;
class Demo extends Frame
{
 Label l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
 TextField t1,t2,t3,t4,t5,t6;
 Button b1;
 Choice c1,c2;
 Checkbox cb1,cb2;
 CheckboxGroup cg;
 Demo()
 {
    setVisible(true);
    setLayout(new FlowLayout());
    setSize(500,500);
    
     l1=new Label("Name");
     l2=new Label("Address");
     l3=new Label("Qualification");
     l4=new Label("Phone No");
     l5=new Label("Email Id");
    l6=new Label("Experiance-y/m");
    l7=new Label("Years");
    l8=new Label("Month");
    l9=new Label("Platform");
    l10=new Label("Gender");
    
    t1=new TextField(30);
    t2=new TextField(25);
    t3=new TextField(10);
    t4=new TextField(10);
    t5=new TextField(5);
    t6=new TextField(5);
    
   b1=new Button("Submit");
   cg=new CheckboxGroup();
   cb1=new Checkbox("Male",cg,true);
   cb2=new Checkbox("Female",cg,false);
   
   c1=new Choice();
     c1.add("Select One");
   c1.add("BCS");
   c1.add("MCS");
   c1.add("BCA");
   c1.add("MCA");
   c1.add("BBACA");
   c1.add("BE Computer");
   c1.add("BcTech Computer");
   
   c2=new Choice();
   c2.add("Select One");
   c2.add("Java");
   c2.add("Python");
   c2.add("Oracle");
   c2.add("C++");
   c2.add("Data Science");
   
   add(l1); add(t1);
   add(l2); add(t2);
   add(l3); add(c1);
   add(l4); add(t3);
   add(l5); add(t4);
   add(l6); 
   add(l7); add(t5);
   add(l8); add(t6);
   add(l9); add(c2);
   add(l10); add(cb1); add(cb2);
   add(b1);
   
 }
 public static void main(String arg[])
 {
  new Demo();
 }
}
