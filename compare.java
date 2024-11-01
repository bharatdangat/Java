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
 int k=s1.compareTo(s2);
 if(k==0)
System.out.println("both strings are equal.....");
 if(k>0)
 System.out.println("first string is greater");
 if(k<0)
 System.out.println("second string is greater");
 }
}
