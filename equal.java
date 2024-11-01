import java.util.*;
class Demo
{
public static void main(String arg[])
{
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter first string-");
 String s1=sc.nextLine();
 System.out.println("Enter second string-");
 String s2=sc.nextLine();
  if(s1.equalsIgnoreCase(s2))
  System.out.println("Strings are same");
  else
 System.out.println("Strings are not same");
  }
}
