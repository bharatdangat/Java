import TY.*;  
import java.util.*;
class Demo
{
public static void main(String arg[])
 {
 Calculate ob=new Calculate();
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

