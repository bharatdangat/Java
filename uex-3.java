//write java program to accept no from user if no is zero then throw user defined exc"NUMBER IS ZERO" if it is non numeric then generate error "NUMBER IS INVALID " otherwise check it is palindrome or not
import java.util.*;
class CheckNumberException extends Exception  //create user defined except.
{ 
  public String toString()
  {
    return "NUMBER IS ZERO EXCEPTON.......";
  }
}
class Demo
{
 public static void main(String arg[])
 {
  try
  {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter Number-");
   int n=sc.nextInt();
   if(n==0)
   {
     throw new CheckNumberException();
     //vvvvvvvvvvvvvvvvvimp...........
   }
    int d,r=0;
    int p=n;
     while(n>0)
     {
        d=n%10;
        r=(r*10)+d;
        n=n/10;
     }
     if(r==p)
     System.out.println("Number is palindrome.....");
     else
     System.out.println("Number is not palindrome....");
   }
   catch(CheckNumberException e)
   {
     System.out.println(e);
   }
   catch(Exception e1)
   {
     System.out.println("NUMBER IS INVALID.........");
   }
 }
}
