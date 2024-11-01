//Create user defined exception for-Negative Age
import java.util.*;
class NegativeAgeException extends Exception
{
    public  String toString()                           //create user defined exception.......
    {
       return "NegativeAge Exception Erroor...........!!!";
    }
}
class Demo
{
 public static void main(String arg[])
 {
   try
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter Age-");
       int age=sc.nextInt();
       if(age<=0)
       {
              throw new  NegativeAgeException();          //throw    
         }
         System.out.println("Age-"+age);
   }
   catch(NegativeAgeException e)               //only user defined negative age exception
                                                                                       //catch
   {
     System.out.println(e);
   }
   catch (Exception e1)                         // system defined exception
   {
    System.out.println(e1);
   }
      }
    }
  
