//accept n numbers in array and display.......
import java.util.*;
class Demo
{
 public static void main(String arg[])
 {
  //syntax=datatpe arrayname[]=new datatype size[n];
  int a[]=new int[100];
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter Limit-");
  int n=sc.nextInt();
  System.out.println("Enter n numbers-");
  for(int i=0;i<n;i++)
  {
   a[i]=sc.nextInt();
  }
  System.out.println("Numbers-");
  for(int i=n;i<n;i++)
  {
   System.out.println(a[i]+" ");
  }
 }
}

