//copy the all files and folder in String array
import java.io.*;
class Demo
{
   public static void main(String arg[])throws Exception
   {
       File f1=new File("DATA STRUCTURE-II");
       if(f1.isDirectory())
       {
            String s1[]=f1.list();
            for(int i=0;i<s1.length;i++)
            System.out.println(s1[i]);
       }
   }
}
