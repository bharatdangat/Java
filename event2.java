//accept number and display square and cube using event.......
import java.awt.*;   
import java.awt.event.*;//import package
import java.lang.Integer;
class Demo extends Frame implements  ActionListener      //implements litner intergace  
{
   Label l1,l2;
   TextField t1,t2;
   Button b1,b2;
   Demo()
   {
      setVisible(true);
      setSize(500,500);
      setBackground(Color.pink);
      setLayout(new GridLayout(3,2));
      
      l1=new Label("Enter No");
      l2=new Label("Result");
      b1=new Button("Square");
       b2=new Button("Cube");
       t1=new TextField(10);
      t2=new TextField(10);
    
      add(l1); add(t1); add(l2); add(t2); add(b1); add(b2);
         
         b1.addActionListener(this);           //add event refference
          b2.addActionListener(this);
      }
       public void actionPerformed(ActionEvent ae) //ovverride method...
      {
            if(ae.getSource()==b1)                 //handle event...
        {
               String s1=t1.getText();
               int n=Integer.parseInt(s1);
               int s=n*n;
                t2.setText(""+s);
        }
        if(ae.getSource()==b2)
        {
              String s1=t1.getText();
              int n=Integer.parseInt(s1);
              int c=n*n*n;
              t2.setText(""+c);
        }
   }
   public static void main(String arg[])
   {
       Demo ob=new Demo();
   }
}
