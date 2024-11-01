//accept n names and dispaly.......
import java.util.*;
class Demo
{
 public static void main(String arg[])
 {
  String a[]=new String[10];
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter Limit-");
  int n=sc.nextInt();
  System.out.println("Enter n student names-");
  for(int i=0;i<n;i++)
  {
   a[i]=sc.next();
  }
  System.out.println("Names-");
  for(int i=0;i<n;i++)
  {
   System.out.println(a[i]);
  }
 }
}


