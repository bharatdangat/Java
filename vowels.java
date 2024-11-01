//write java program to display all vowels in given string
import java.util.*;
class Demo
{
 public static void main(String arg[])
 {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter String");
   String s1=sc.nextLine();
   System.out.println("Vowels-");
   for(int i=0;i<s1.length();i++)
   {
    if(s1.charAt(i)=='a'||s1.charAt(i)=='e'||s1.charAt(i)=='i'||s1.charAt(i)=='o'||  s1.charAt(i)=='u')
    {
      System.out.println(s1.charAt(i));
    }
   }
 }
}
