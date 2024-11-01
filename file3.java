//copy the content of one file to another...................
import java.io.*;
class Demo
{
 public static void main(String arg[])throws Exception
 {
   FileInputStream f1=new FileInputStream("file1.java");
   FileOutputStream f2=new FileOutputStream("file11.java");
   int k;
   while((k=f1.read())!=-1)
   {
      f2.write(k);

   }
    f1.close();
    f2.close();
    System.out.println("File copy seccc..........");
 }
}
