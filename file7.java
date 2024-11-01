//write java program to display each word from file in reverse order............
//we use FILEREADER
import java.io.*;
class Demo
{
   public static void main(String arg[])throws Exception
   {
        FileReader f1=new FileReader("abc.txt");
        BufferedReader br=new BufferedReader(f1);
        String s1="";     //for copy the line.......
        while((s1=br.readLine())!=null)
        {
               String s2[]=s1.split(" ");
               for(int i=0;i<s2.length;i++)
              {  
                         StringBuffer sbr=new StringBuffer(s2[i]);
                         sbr.reverse();
                         System.out.println(sbr+" ");
              }
             
        }
        f1.close();
   }
}
