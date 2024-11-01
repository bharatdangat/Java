//create awt for gender selection
import java.awt.*;
class Demo extends Frame
{
    Label l1;
    Checkbox c1,c2;
    CheckboxGroup cg;
     Demo()
     {
          setVisible(true);
          setSize(500,500);
          setBackground(Color.white);
          setTitle("Select Gender");
          setLayout(new FlowLayout()); //vvvvvvvvvimp
          
          l1=new Label("Select Gender");
          cg=new CheckboxGroup();
          c1=new Checkbox("Male",cg,true);
           c2=new Checkbox("Female",cg,false);
           
        add(l1);  add(c1);  add(c2);
        
     }
    public static void main(String arg[])
    {
      Demo ob=new Demo();
    }
}
