//accept number and display its table
import java.awt.*;
import java.lang.Integer;
import java.awt.event.*;
class Demo  extends Frame implements ActionListener
{
  Label l1,l2,l3;
  TextField t1;
  List l;
  Button b1,b2;
  Demo()
  {
    setVisible(true);
    setLayout(new FlowLayout());
    setSize(500,500);
    
    l1=new Label("Enter Number-");
    l2=new Label("Table");
    t1=new TextField(10);
    l=new List(10);
    b1=new Button("OK");
    b2=new Button("clear");
    
    
    add(l1); add(t1); add(l2); add(l); add(b1); add(b2); 
    b1.addActionListener(this);
    b2.addActionListener(this);

  }
    public void actionPerformed(ActionEvent ae)
    {
       if(ae.getSource()==b1)
       {
            String s1=t1.getText();
            int n=Integer.parseInt(s1);
            for(int i=1;i<=10;i++)
            {
                    l.add(n*i+"\n");      //vvvvvimp (add) not setText()
            }
             
      }
       if(ae.getSource()==b2)
       {
              l.clear();
     }
      
    }

   public static void main(String arg[])
   {
     new Demo();
   }
}
