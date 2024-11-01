//READ ONE BY ONE CHAR FROM FILE AND DISPLAY........
import java.io.*;
class Demo
{
  public static void main(String arg[])throws Exception
  {
    FileInputStream f1=new FileInputStream("abc.txt");
    int k;
    while((k=f1.read())!=-1)
    {
       System.out.print((char)k);
    }
    f1.close();
  }
}


