//accept number from user if no is zero then throw user defined exception "zero number exception" otherwise display sum of first and last digit.............
import java.util.*;
class ZeroNumberException extends Exception
{
  public String  toString() 
  {
     return "ZeroNumberException...........";
  }
}
class MD
{
  public static void main(String arg[])
  {
     try
     {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter No");
         int n=sc.nextInt();
         if(n==0)
         {
         throw new ZeroNumberException();
         }
         int last=n%10;        //calcualte last digit.........
         int first=0;
         while(n>0)
         {
          first=n%10;
          n=n/10;            //calculate first digit........
         }
         System.out.println("Sum of First And Last Digit-"+(first+last));
     }
      catch(ZeroNumberException e)
      {
        System.out.println(e);
      }
  }
}
