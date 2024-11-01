//write java program to check whether given candidate eligible for voting or not
import java.util.*;
class VotecheckException extends Exception  //create user defined exc.
 {
      public String toString()
    {
      return "Candidate is Not Eligible for voting.............";
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
      if(age<=18)
      {
      throw new VotecheckException();   //throw exc..
      //new vvvvvvvvvvvvvimp........
         }
         System.out.println("Candiate is eligible for votting age="+age);
   }
   catch( VotecheckException e)       //catch
   {
     System.out.println(e);
   }
   catch(Exception e1)
   {
     System.out.println(e1);
   }
 }
}
