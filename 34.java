//Acept Number and check prime or not
import java.util.*;
class prime
{
 public static void main(String arg[])
 {
 int i; // i declare globally becoz i use in 2 times ie after break........
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter Number-");
  int n=sc.nextInt();
  for(int i=2;i<n;i++)
  {
   if(n%i==0)
   break;
  }
  if(int i==n)
  System.out.println("Number is prime.....");
  else
  System.out.println("Number is not prime......");
 }
}
