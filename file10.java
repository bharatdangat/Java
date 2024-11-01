//write java program to copy data from one file to another file while copying change the case of characters in target file and replace all digit by *...........
import java.io.*;
class Demo
{
  public static void main(String arg[])throws Exception
  {
     FileInputStream f1=new FileInputStream("om.txt");
     FileOutputStream f2=new FileOutputStream("sai.txt");
     int k;
     while((k=f1.read())!=-1)
     {
         if(Character.isUpperCase(k))
                 f2.write(Character.toLowerCase (k));
          else if(Character.isLowerCase(k))
                   f2.write(Character.toUpperCase (k));
            else if(Character.isDigit(k))
                     f2.write('*');
              else if(k=='\n')
                    f2.write('\n');
              //f2.write(k);
     }
     f1.close();
     f2.close();
     System.out.println("File Copy succccccccc");
  }
}
