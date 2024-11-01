//accept name of two files and copy  the contents of first to second file and first file having book name and author name in file second file having the contents of first file and also comment "end of file" at the end..........
//for comment hece we use "CHARACTER STREAM CLASEESS"
import java.util.*;
import java.io.*;
class Demo
{
   public static void main(String arg[])throws Exception
   {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter Source File-");
      String s1=sc.next();
        System.out.println("Enter Destination File-");
        String s2=sc.next();
        FileReader f1=new FileReader(s1);
        FileWriter f2=new FileWriter(s2);
        BufferedReader br =new BufferedReader(f1);
        BufferedWriter bw =new BufferedWriter(f2);
        String s=" ";
        while((s=br.readLine())!=null)
        {
              bw.write(s+"\n");
             }      
       bw.write("comment-END OF FILE.............");
        br.close();
        bw.close();
        f1.close();
        f2.close();
        System.out.println("file copy successfully....................");
   }
}


