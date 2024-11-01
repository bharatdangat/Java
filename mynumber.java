//define class MyNumber.having one private int data member write default conc.to initilize it to zero and another cons.to initilize it to value (use this) write method isNegative(),isPositive(),isZero(),isOdd(),isEven(). create object in main..
class MyNumber 
{
  private int n;
  MyNumber()                 
 {
    n=0;
 }
 MyNumber(int n)
 {
  this.n=n;
 }
 boolean  isNegative()
 {
   if(n<0)
   return true;
   else
   return false;
 }
 
 boolean isPositive()
 {
  if(n>0)
   return true;
   else
   return false;
 }
 boolean isZero()
 {
  if(n==0)
   return true;
   else
   return false;
 }
 boolean isOdd()
 {
  if(n%2==1)
   return true;
   else
   return false;
}
boolean isEven()
{
if(n%2==0)
   return true;
   else
   return false;
}
public static void main(String arg[])
{
  MyNumber ob=new MyNumber();
  if(ob.isNegative())
  System.out.println("Number Is negative...");
  if(ob.isPositive())
  System.out.println("Number Is positive...");
  if(ob.isZero())
  System.out.println("Number Is zero...");
  if(ob.isOdd())
  System.out.println("Number Is odd...");
  if(ob.isEven())
  System.out.println("Number Is even...");
  }
  }
  
