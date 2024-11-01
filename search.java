//write java program to search name an array.
import java.util.*;
class Demo 
{
 public static void main(String arg[])
 {
  int i;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter Limit-");
  int n=sc.nextInt();
   String a[]=new String[n];
   //datatype arrayname []=new araryname[soze];
  System.out.println("Enter n names-");
  for( i=0;i<n;i++)
  {
    a[i]=sc.next();
   }
   System.out.println("Enter Name to search-");
   String name=sc.next();
   for( i=0;i<n;i++)
   {
      if(a[i].equals(name))
      break;
   }
   if(i==n)
   System.out.println("Name is not found........");
   else
  System.out.println("Name is found........");
   
 }
}
