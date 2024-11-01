//write java program to calculate frequency of each number in number
import java.util.*;
class Demo
{
 public static void main(String arg[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter Limit-");
  int n=sc.nextInt();
  int a[]=new int [n];     //array declartion
  System.out.println("Enter n numbers-");
  for(int i=0;i<n;i++)
 {
    a[i]=sc.nextInt();
 }
    int b[]=new int [100];
    for(int i=0;i<b.length;i++)
     b[i]=0;
     for(int i=0;i<n;i++)
     {
      b[a[i]]++;
     }
     for(int i=0;i<b.length;i++)
     {
      if(b[i]!=0)
      System.out.println(i+"Count-"+b[i]);
     }
 }
}

