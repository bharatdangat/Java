abstract class A
{
  A()
  {
    System.out.println("I am Abstract -A");
  }
   abstract void add(int a,int b);      //abstrct method
   void square(int n)               //non abstrct method
  {
   int s=n*n;
   System.out.println("Squaere ="+s);
  }
}

class B extends A
{
 void add(int a,int b)
 {
  int c=a+b;
  System.out.println("Addition-"+c);
 }
}
class MD
{
 public static void main(String arg[])
 {
  B ob=new B();
  ob.add(11,22);
  ob.square(4);
  }
}
