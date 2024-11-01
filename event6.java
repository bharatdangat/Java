import java.awt.*;
import java.awt.event.*;
class Demo extends Frame implements ActionListener 
{
   Label l1;
   Button b1;
   TextField t1,t2;
 Demo()
 {
   setVisible(true);
   setSize(500,500);
   setBackground(Color.orange);
   setLayout(new FlowLayout());
   
   l1=new Label("Enter Username-");
   t1=new TextField(30);
   t2=new TextField(30);
   b1=new Button("Submit");
   add(l1); add(t1);  add(b1); add(t2);
  b1.addActionListener(this);   //add reffrencs
 }
 public void actionPerformed(ActionEvent ae)          //ovverride method
 {
       if(ae.getSource()==b1)      //handle event
   {
        String s1=t1.getText();
        t2.setText("Hello,"+s1+",Nice To Meet You!");
   }
 }
 public static void main(String arg[])
 {
  Demo ob=new Demo();
 }
}
