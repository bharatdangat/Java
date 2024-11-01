//check number is armstrong or not........
import java.util.*;
class number
{
 public static void main(String argc[])
 { 
  int s=0;
  int d;
  
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter Number-");
  int n=sc.nextInt();
  int p=n;
  while(n>0)
  {
   d=n%10;
   s=s*10+d;
   n=n/10;
  }
  

  if(s==p)
  System.out.println("Number is Armstrong.......");
  else
  System.out.println("Number is Not Armstrong.........");
 }
 }
