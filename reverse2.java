//write java program to display each word in string  reverse order from  string array
import java.util.*;
class Demo
{
 public static void main(String arg[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter String-");
  String s1=sc.nextLine();
  String s2[]=s1.split(" "); //or ("")   //use split for split after space.....
  for(int i=s2.length-1;i>=0;i--)
  System.out.print(s2[i]+" "); //or ("")
 }
}


