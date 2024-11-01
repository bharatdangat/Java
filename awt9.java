//create co-Win regisrtation form using awt.......
import java.awt.*;
class Demo extends Frame
{
 Label l1,l2,l3,l4,l5,l6,l7,l8;
    TextField t1,t2;
    Button b1;
    Checkbox ca1,ca2,cv1,cv2,cv3,ct1,ct2,ct3;
    CheckboxGroup ca,cv,ct;
    Choice c1,c2;
    
 Demo()
 {
     setVisible(true);
     setSize(500,500);
     setLayout(null);
     setBackground(Color.white);
     
      l1=new Label("Co-Win Registration");
      l2=new Label("Adhar  Card No");
      l3=new Label("Birth  Year");
      l4=new Label("Mobile No");
      l5=new Label("Age Group");
      l6=new Label("Select Hospital");
      l7=new Label("Vaccines");
      l8=new Label("Time Slot");
      
      t1=new TextField(10);
      t2=new TextField(10);
      b1=new Button("Submit");
      
      ca=new CheckboxGroup();
      ca1=new Checkbox("18&above",ca,true);
      ca2=new Checkbox("45 & above",ca,false);
      cv=new CheckboxGroup();
      cv1=new Checkbox("Covaxin",cv,true);
      cv2=new Checkbox("Covishild",cv,false);
      cv3=new Checkbox("Sputnik",cv,false);
      
      ct=new CheckboxGroup();
      ct1=new Checkbox("Morning",ct,true);
      ct2=new Checkbox("Afternoon",ct,false);
      ct3=new Checkbox("Evening",ct,false);
      
      c1=new Choice();
      c2=new Choice();
      
     l1.setBounds(240,40,400,30);
    l2.setBounds(50,80,120,50);  
      t1.setBounds(200,90,200,30); 
     l3.setBounds(50,140,100,30);
     c1.setBounds(200,140,100,30);
     l4.setBounds(50,200,100,30);
     t2.setBounds(200,195,200,30);
    l5.setBounds(50,260,100,30);
    ca1.setBounds(200,250,150,30);
    ca2.setBounds(400,250,200,30);   
l6.setBounds(50,300,150,50);
  c2.setBounds(200,310,100,30);
  l7.setBounds(50,370,90,30); 
   cv1.setBounds(200,370,100,30);
  cv2.setBounds(300,370,100,30);
  cv3.setBounds(400,370,100,30);       
  l8.setBounds(50,390,150,50); 
  ct1.setBounds(200,400,100,30);
  ct2.setBounds(300,400,100,30);
  ct3.setBounds(400,400,100,30);
  b1.setBounds(250,500,100,50); 
      
    Font f=new Font("C059",Font.BOLD,30);
    Font f2=new Font("Norasi",Font.BOLD,15);
    l1.setFont(f);
    l2.setFont(f2);
    l3.setFont(f2);
    l4.setFont(f2);
   l5.setFont(f2);
   l6.setFont(f2);
   l7.setFont(f2);
    l8.setFont(f2);
     
     
        
   add(l1);
    add(l2); add(t1);
    add(l3);       add(c1);
     c1.add("2001"); c1.add("2002"); c1.add("2003"); c1.add("2004"); c1.add("2005");

    add(l4);  add(t2);
    add(l5); add(ca1); add(ca2);
     add(l6); add(c2);
     c2.add("S.K Hospital"); c2.add("A.R Hospital"); c2.add("City Hospital");
      add(l7); add(cv1); add(cv2); add(cv3);
      add(l8); 
      add(ct1); add(ct2); add(ct3);
      add(b1);
 }
   public static void main(String arg[])
   {
       new Demo();
   }
}
