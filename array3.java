//accept n numbers in array and display in reverse
import java.util.*;
class Demo
{
 public static void main(String arg[])
 {
  int a[]=new int[100];
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter Limit-");
  int n=sc.nextInt();
  System.out.println("Enter n numbers-");
  for(int i=0;i<n;i++)
  {
   a[i]=sc.nextInt();
  }
  System.out.println("reverse order-");
  for(int i=n-1;i>=0;i--)
  {
   System.out.print(a[i]+" ");
  }
 }
}
