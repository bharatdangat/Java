//write java program to read characters from file if character is alphabet then revrese its case if not then display its categery on screen(whether its digit or spaces)
import java.io.*;
class Demo
{
  public static void main(String arg[])throws Exception
  {
     FileInputStream f1=new FileInputStream("Bharat.txt");
     int k;
     while((k=f1.read())!=-1)
     {
          if(Character.isUpperCase(k))
            System.out.print(Character.toLowerCase((char)k));
         else if(Character.isLowerCase(k))
            System.out.print(Character.toUpperCase((char) k));
          else if(Character.isDigit(k))
          System.out.println("\ncharcter is digit");
          else if(Character.isWhitespace(k))
          System.out.println("\ncharacter is space");
          else if(k=='\n')
          System.out.println('\n');
     }
     f1.close();
  }
}

