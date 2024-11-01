//write java program to display each word in string  reverse order from  string array (use sSTRING BUFFER)
import java.util.*;
class Demo
{
 public static void main(String arg[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter String-");
  String s1=sc.nextLine();
  String s2[]=s1.split(" ");
  for(int i=0;i<s2.length;i++)
  {
     StringBuffer sbr=new StringBuffer(s2[i]);
     sbr.reverse();
     System.out.print(sbr+" ");
  }
  }
  }
