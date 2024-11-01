//copy the content of one file to another use command line argument...(use char by char)
import java.io.*;
class Demo
{
 public static void main(String arg[])throws Exception
 {
   FileInputStream f1=new FileInputStream(arg[0]);
   FileOutputStream f2=new FileOutputStream(arg[1]);
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
