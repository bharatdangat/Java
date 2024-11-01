//read data from keyboard write data into the file,,,,,
import java.io.*;
class Demo
{
 public static void main(String srg[])throws Exception
 {
   FileOutputStream f1=new FileOutputStream("pqrst.txt");
   int k;
   System.out.println("Enter data upto ctrl z to write into file-");
   while((k=System.in.read())!=-1)
   {
      f1.write(k);
   }
   f1.close();
   System.out.println("file copy succcc...");
 }
}
