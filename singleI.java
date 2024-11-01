//single Inheritance
class A
{
  A()     //costructor........
  {
   System.out.println("I am Base Class...");
  }
}
class B extends A
{
  B()
  {
   System.out.println("I am Derived Class...");
  }
}
class MDemo
{
public static void main(String arg[])
{
  //we create object of derived class 
  B ob=new B();
}
}
