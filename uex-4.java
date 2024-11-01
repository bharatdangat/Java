//write java program to validate PAN no and mobile NO..........
//PAN=AAAAA1111A
import java.util.*;
class InavalidDataException extends Exception  //create user defined exc.. 
{ 
  public String toString()
  {
    return "INVALID PAN NUMBER OR MOBILE NUMBER..... ";
  }
}
class Demo
{
  public static void main(String arg[])
  {
    try
    {
      int i;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter PAN No-");
        String pan=sc.next();
       for(i=0;i<5;i++)
       { 
        if (!Character.isUpperCase(pan.charAt(i)))
        throw new InavalidDataException();
        }
        for(i=5;i<9;i++)
       {
        if (!Character.isDigit(pan.charAt(i)))
        throw new InavalidDataException();
       }
            if (!Character.isUpperCase(pan.charAt(9)))
          throw new InavalidDataException();      
       
       System.out.println("Enter MOBILE No-");
        String  mob=sc.next();
        if(mob.length()!=10)
          throw new InavalidDataException();
          
          System.out.println("Info Is Correct...........");
    }

    catch(Exception e)
    {
     System.out.println(e);
    }
  }
}

