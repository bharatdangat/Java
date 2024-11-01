/*write menu driven program to perform following operation 
1]calculate volume of cylinder(v=3.14r^2h)
2]find factorial of given no
3]check number is armstrong or not
->*/
import java.util.*;
class Demo
{
 void cylinder(float r,float h)
 {
  float v=3.14f*r*r*h;
  System.out.println("Volume of cylinder-"+v);
 }
 void factorial(int n)
 {
  int f=1;
  for(int i=1;i<=n;i++)
  {
   f=f*i;
  }
  System.out.println("Factorial="+f);
 }
 void armstrong(int n)
 {
  
  int n1=n;
  int s=0;
  while(n>0)
  {
   int d=n%10;
   s=s*10+d;
   n=n/10;
  }
  if(n1==s)
  System.out.println("Number is armstrong");
  else
  System.out.println("Number is not armstrong");
 }
 public static void main(String arg[])
 {
  Demo ob=new Demo();
  Scanner sc=new Scanner(System.in);
   int ch;
   do
   {
    System.out.println("\n1-volume of cylinder \n2-factorial \n3-Armstrong");
    System.out.print("Enter Choice-");
    ch=sc.nextInt();
    switch(ch)
    {
     case 1:System.out.print("Enter radius-");
          float r=sc.nextFloat();
          System.out.print("Enter height-");
          float h=sc.nextFloat();
          ob.cylinder(r,h);
          break;
    case 2:System.out.println("Enter Number-");
          int n=sc.nextInt();
          ob.factorial(n);
          break;
    case 3:System.out.println("Enter Number-");
          n=sc.nextInt();
         ob.armstrong(n);
         break;
    }
   }while(ch<4);
 }
}
