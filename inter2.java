//define an interface "Interger" with abstrct method check() write java program to check whether number is positive or negative

//NOTE-METHODS DECLAED IN INTERFACE BY DEFAULT ABSTRACT........
import java.util.*;
interface Integer
{
  void check(int n);
}
class Demo implements Integer 
{
  //method in interface are always public
  public void check(int n)
  {   
     if(n>0)
     System.out.println("Number is positive.....");
     else
     System.out.println("Number is negative.......");
  }
}
class MD 
{
 public static void main(String arg[])
 {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter Number-");
   int n=sc.nextInt();

   Demo ob=new Demo();
   ob.check(n);
 }
}
