//write java program to accept n city name and display in ascending order.........
import java.util.*;
class Demo 
{
 public static void main(String arg[])
 {
  int i,pass;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter Limit-");
  int n=sc.nextInt();
   String a[]=new String[n];
   //datatype arrayname []=new araryname[soze];
  System.out.println("Enter n  city names-");
  for( i=0;i<n;i++)
  {
    a[i]=sc.next();
   }
   //we use bubble sort...........
      for(pass=1;pass<n;pass++)
   {
    for(i=0;i<n-pass;i++)
    {
     if(a[i].compareTo(a[i+1])>0)
     {
       String t=a[i];
       a[i]=a[i+1];
       a[i+1]=t;
     }
     }
     }
     System.out.println("City names in asc order-");
     for(i=0;i<n;i++)
     {
      System.out.println(a[i]);
   }
}
}




