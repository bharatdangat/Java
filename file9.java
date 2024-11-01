//write java program to accept string from user and write ASCIII values of characters from string into file........
//we use file outputstream
import java.util.*;
import java.io.*;
class Demo
{
  public static void main(String arg[])throws Exception
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter String-");
    String s1=sc.nextLine();
    FileOutputStream f1=new FileOutputStream("f.txt");
    for(int i=0;i<s1.length();i++)
    {
        int ch=s1.charAt(i);
        f1.write(ch);
    }
    f1.close();
    System.out.println("File copy succc.......");
  }
}
