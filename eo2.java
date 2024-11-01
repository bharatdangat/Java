//Accept Number from user and check even or odd
import java.util.*;
class check
{
 public static void main(String arg[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter Number-");
  int n=sc.nextInt();
  if(n%2==0)
  System.out.println("Number is even.....");
  else
  System.out.println("Number is odd.......");
 }
}
