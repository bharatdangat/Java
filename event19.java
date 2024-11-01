//create notepad using awt.........
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Demo extends Frame implements ActionListener
{
 TextArea ta;
 MenuBar mb1;
 Menu m1,m2,m3,m4,m5;
 MenuItem i1,i2,i3,i4;
  Demo()
  {
      setVisible(true);
      setSize(500,500);
      
      ta=new TextArea();
      add(ta);
      mb1=new MenuBar();
      setMenuBar(mb1);
      m1=new Menu("File");
      mb1.add(m1);
      m2=new Menu("Edit");
       mb1.add(m2);
      m3=new Menu("Format");
       mb1.add(m3);
      m4=new Menu("view");
       mb1.add(m4);
      m5=new Menu("help");
       mb1.add(m5);
       i1=new MenuItem("new");
       i2=new MenuItem("open");
       i3=new MenuItem("save");
       i4=new MenuItem("exit");
      m1.add(i1);  m1.add(i2);  m1.add(i3);  m1.add(i4);
      i1.addActionListener(this);
      i2.addActionListener(this);
      i3.addActionListener(this);
     i4.addActionListener(this);
  }
  
  
  public void actionPerformed(ActionEvent ae)
  {
     if(ae.getSource()==i1)
     {
         ta.setText(" ");
     }
     if(ae.getSource()==i2)
     {
         try
     {
        JFileChooser jf=new JFileChooser();     //class
         jf.showOpenDialog(this);           //method
         File f1=jf.getSelectedFile();
         String s1=f1.getName();
         FileReader f2=new FileReader(s1);
         BufferedReader br=new BufferedReader(f2);
         while((s1=br.readLine())!=null)
         {
             ta.append(s1+"\n");
         }
     }
         catch(Exception e)
         {}
     }
     if(ae.getSource()==i3)
     {
     try
     {
         JFileChooser jf=new JFileChooser();
         jf.showOpenDialog(this);
         File f1=jf.getSelectedFile();
         String s1=f1.getName();
         FileWriter f2=new FileWriter(s1);
         BufferedWriter bw=new BufferedWriter(f2);
         String str=ta.getText();
         bw.write(str);
         bw.close();
         f2.close();
         }catch(Exception e){}
     }
     if(ae.getSource()==i4)
     {
         dispose();
     
  }
  }
  public static void main(String arg[])
  {
     new Demo(); 
  }
  
  }
  
