//Accept number and check is perfect or not
import java.util.*;
class perfect
{
 public static void main(String abc[])
 {
  int i;  //globally declared...........
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter Number-");
  int n=sc.nextInt();
  int c=0;
  for(i=1;i<n;i++)
  {
   if(n%i==0)
   c=c+i;
  }
  if(n==c)
  System.out.println("Number is perfect.......");
  else
  System.out.println("Number is not perfect....");
 }
}
