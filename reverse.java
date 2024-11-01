//REVERSE NO USING JAVA.....
import java.util.*;
class reverse
{
 public static void main(String arg[])
 {
  int s=0;
  int d;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter Number-");
  int n=sc.nextInt();
  while(n>0)
  {
   d=n%10;
   s=s*10+d;
   n=n/10;
  }
  System.out.println("Reverse No="+s);
 }
}
